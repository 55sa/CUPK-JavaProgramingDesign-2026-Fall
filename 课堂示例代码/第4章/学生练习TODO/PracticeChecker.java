import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.tools.*;

/** Teacher-provided checker. Students only edit the practice file. JDK 8+. */
public class PracticeChecker {
    static String decode(String s) { return new String(Base64.getDecoder().decode(s), StandardCharsets.UTF_8); }
    static String normalize(String s) { return s.replace("\r\n", "\n").trim(); }
    static String read(Path p) throws Exception { return new String(Files.readAllBytes(p), StandardCharsets.UTF_8); }
    static void clean(Path dir) throws Exception {
        try (java.util.stream.Stream<Path> paths = Files.walk(dir)) {
            Path[] all = paths.sorted(Comparator.reverseOrder()).toArray(Path[]::new);
            for (Path p : all) {
                boolean deleted = false;
                for (int attempt = 0; attempt < 6; attempt++) {
                    try { Files.deleteIfExists(p); deleted = true; break; }
                    catch (java.io.IOException ex) { Thread.sleep(50); }
                }
                // Windows scanners may briefly hold a finished process's output file.
                // Cleanup must never interrupt grading.
                if (!deleted) p.toFile().deleteOnExit();
            }
        }
    }
    static String check(JavaCompiler compiler, String body, String expected) throws Exception {
        Path dir = Files.createTempDirectory("java-practice-");
        try {
            Path source = dir.resolve("StudentTask.java");
            // Each block contains normal top-level model classes plus one TaskNN main.
            // Rename only the entry class; model classes remain ordinary classes.
            String program = body.replaceFirst("\\bclass Task[0-9]{2}\\b", "public class StudentTask");
            Files.write(source, program.getBytes(StandardCharsets.UTF_8));
            DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
            try (StandardJavaFileManager manager = compiler.getStandardFileManager(diagnostics, Locale.ENGLISH, StandardCharsets.UTF_8)) {
                boolean ok = compiler.getTask(null, manager, diagnostics,
                    Arrays.asList("-encoding", "UTF-8", "-d", dir.toString()), null,
                    manager.getJavaFileObjects(source.toFile())).call();
                if (!ok) {
                    for (Diagnostic<?> d : diagnostics.getDiagnostics()) {
                        if (d.getKind() == Diagnostic.Kind.ERROR)
                            return "编译错误 / COMPILE ERROR: " + d.getMessage(Locale.ENGLISH);
                    }
                    return "编译错误 / COMPILE ERROR";
                }
            }
            boolean win = System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("win");
            Path java = Paths.get(System.getProperty("java.home"), "bin", win ? "java.exe" : "java");
            Path output = dir.resolve("output.txt");
            Process child = new ProcessBuilder(java.toString(), "-Xmx64m", "-Dfile.encoding=UTF-8",
                "-Duser.language=en", "-Duser.country=US", "-cp", dir.toString(), "StudentTask")
                .redirectErrorStream(true).redirectOutput(output.toFile()).start();
            long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(3);
            String stopped = null;
            try {
                while (!child.waitFor(50, TimeUnit.MILLISECONDS)) {
                    if (System.nanoTime() > deadline) { stopped = "超时 / TIMEOUT: 检查循环条件和自增自减 / Check loop conditions and updates"; break; }
                    if (Files.size(output) > 65536) { stopped = "输出过多 / TOO MUCH OUTPUT: 检查循环 / Check the loop"; break; }
                }
            } finally {
                if (child.isAlive()) { child.destroyForcibly(); child.waitFor(); }
            }
            if (stopped != null) return stopped;
            if (Files.size(output) > 65536) return "输出过多 / TOO MUCH OUTPUT";
            String actual = normalize(read(output));
            if (child.exitValue() != 0) return "运行错误 / RUNTIME ERROR: " + actual.substring(0, Math.min(350, actual.length()));
            if (!actual.equals(normalize(expected)))
                return "结果不符 / WRONG OUTPUT\n    预期 / Expected: " + normalize(expected).replace("\n", " | ")
                    + "\n    实际 / Actual: " + actual.substring(0, Math.min(350, actual.length())).replace("\n", " | ");
            return null;
        } finally { clean(dir); }
    }
    private static final StringBuilder report = new StringBuilder();
    static void log(String message) {
        System.out.println(message);
        report.append(message).append(System.lineSeparator());
    }
    public static void main(String[] args) throws Exception {
        report.setLength(0);
        Path folder = args.length > 0 ? Paths.get(args[0]).toAbsolutePath() : Paths.get("").toAbsolutePath();
        Path resultFile = folder.resolve("测试结果.txt");
        log("Java 练习测试结果 / Java Practice Results");
        log("时间 / Time: " + java.time.LocalDateTime.now());
        try {
            grade(args);
        } catch (Exception ex) {
            log("测试中断 / CHECKER ERROR: " + ex.toString());
        } finally {
            try {
                Files.write(resultFile, report.toString().getBytes(StandardCharsets.UTF_8));
                System.out.println("结果已保存 / Results saved: " + resultFile);
            } catch (java.io.IOException ex) {
                System.out.println("结果文件保存失败 / Could not save results: " + ex.getMessage());
            }
        }
    }
    static void grade(String[] args) throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) { log("请使用 JDK 运行 / Run with a JDK, not a standalone JRE."); return; }
        Path folder = args.length > 0 ? Paths.get(args[0]).toAbsolutePath() : Paths.get("").toAbsolutePath();
        Path config = folder.resolve("practice-tests.tsv");
        if (!Files.exists(config)) { log("找不到 practice-tests.tsv，请进入练习目录或传入目录路径 / Use the exercise directory."); return; }
        List<String> lines = Files.readAllLines(config, StandardCharsets.UTF_8);
        Path student = args.length > 1 ? Paths.get(args[1]).toAbsolutePath() : folder.resolve(lines.get(0));
        if (!Files.exists(student)) { log("找不到练习文件 / Missing source: " + student); return; }
        log("练习文件 / Source: " + student);
        String source = read(student);
        Map<String, List<String[]>> groups = new LinkedHashMap<>();
        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i).trim().isEmpty()) continue;
            String[] row = lines.get(i).split("\t", -1);
            if (row.length != 5) throw new IllegalArgumentException("Invalid test data at line " + (i+1));
            groups.computeIfAbsent(row[0], k -> new ArrayList<>()).add(row);
        }
        int passed = 0, unfinished = 0, failed = 0;
        for (Map.Entry<String, List<String[]>> entry : groups.entrySet()) {
            String id = entry.getKey();
            java.util.regex.Matcher begin = java.util.regex.Pattern.compile("(?m)^\\s*// BEGIN " + id + "\\s*$").matcher(source);
            java.util.regex.Matcher end = java.util.regex.Pattern.compile("(?m)^\\s*// END " + id + "\\s*$").matcher(source);
            if (!begin.find() || !end.find()) { log(id + " 标记缺失 / MISSING MARKER"); failed++; continue; }
            int from = begin.end(), to = end.start();
            if (to < from || begin.find() || end.find()) { log(id + " 标记重复或顺序错误 / INVALID MARKERS"); failed++; continue; }
            String body = source.substring(from, to);
            if (body.matches("(?s).*__Q\\d+_\\d+__.*")) { log(id + " 未完成 / NOT FINISHED"); unfinished++; continue; }
            String problem = null; int caseNumber = 0;
            for (String[] row : entry.getValue()) {
                caseNumber++;
                String old = decode(row[2]), replacement = decode(row[3]);
                if (!old.isEmpty() && !body.contains(old)) { problem = "固定数据被改动 / FIXED DATA CHANGED: " + old; break; }
                String variant = old.isEmpty() ? body : body.replace(old, replacement);
                problem = check(compiler, variant, decode(row[4]));
                if (problem != null) break;
            }
            String title = decode(entry.getValue().get(0)[1]);
            if (problem == null) { passed++; log(id + " 正确 / PASS: " + title); }
            else { failed++; log(id + " 第 " + caseNumber + " 个测试 / Test " + caseNumber + ": " + problem); }
        }
        log("RESULT passed=" + passed + " unfinished=" + unfinished + " failed=" + failed + " total=" + groups.size());
        log("通过测试代表本题测试用例正确，仍需理解代码。 / Passing means the supplied test cases passed; explain your code too.");
    }
}
