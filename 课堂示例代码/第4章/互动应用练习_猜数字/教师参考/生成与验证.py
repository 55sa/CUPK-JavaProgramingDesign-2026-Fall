from pathlib import Path
import json, re, subprocess, tempfile

ROOT = Path(__file__).resolve().parents[1]
student = (ROOT/'GuessNumberPractice.java').read_text(encoding='utf-8')
keys = ['private', 'int', 'boolean', 'GuessGame', 'this', 'maxAttempts', '0', 'false', 'attempts', 'maxAttempts - attempts', 'won', '||', '++', '<', '>', 'true', 'new GuessGame(secret, 5)', 'new Scanner(System.in)', 'isOver', 'nextLine', 'break', '||', 'game.guess(number)', 'getSummary']
answer = student.replace('// 学生版：只替换 __TODOxx__，其他代码保持不变。','// 教师参考答案 / Teacher answer key')
for i, value in enumerate(keys,1): answer = answer.replace(f'__TODO{i:02}__',value)
(ROOT/'教师参考/GuessNumberPractice.java').write_text(answer,encoding='utf-8')
keytext = '# 参考答案 / Ответы / Answer key / Jogaplar\n\n'+'\n'.join(f'- TODO{i:02}: `{v}`' for i,v in enumerate(keys,1))
keytext += '''

## Türkmençe düşündiriş jogaplary

1. Meýdanlar bir oýnuň ýagdaýyny beýan edýär; metodlar olary ulanýar we täzeleýär.
2. game — obýekte salgylanma, guess — metodyň ady, number — argument.
3. Ýok. attempts her obýektiň öz aýratyn meýdanydyr.
4. Meýdanda int görnüşiniň başlangyç bahasy 0 galýar, sebäbi parametr öz-özüne bellenýär.

## 解释题参考 / Suggested explanations

1. 字段描述一局游戏的状态，游戏方法负责使用和更新它们。 / The fields describe one game's state, which its methods use and update.
2. game 是对象引用，guess 是方法名，number 是实参。 / game is the object reference, guess the method name, and number the argument.
3. 不共享；attempts 是实例字段，每个对象都有自己的值。 / They do not share it: attempts is an instance field with a separate value for each object.
4. 字段保持 int 的默认值 0，因为语句只把参数赋给自身。 / The field stays at the int default of 0 because the statement assigns the parameter to itself.

发给学生时提供上级目录的文件，不包含教师参考目录。 / Distribute the parent folder's student files without this teacher directory.
'''
(ROOT/'教师参考/参考答案.md').write_text(keytext,encoding='utf-8')

runner = '''# 开始游戏：由 Python 转发键盘输入，实际游戏使用 Java。
# Start the game: Python forwards keyboard input; Java runs the actual game.
from pathlib import Path
import os, re, shutil, subprocess, tempfile

JDK_HOME = ""  # 找不到 JDK 时填写根目录 / Set the JDK root if auto-detection fails.
FIXED_ANSWER = ""  # 随机游戏留空，调试可填 "12" / Leave empty for random play; use "12" for debugging.

def start_game():
    filename = Path("GuessNumberPractice.java")
    if not filename.exists():
        print("请先运行 Java 填空单元。/ Ilki Java kodunyň öýjügini işlediň. / Run the Java exercise cell first."); return
    source = filename.read_text(encoding="utf-8")
    if re.search(r"__TODO\\d+__", source):
        print("还有 TODO 未填写，请补全后重新保存代码单元。/ Ähli TODO-lary dolduryň we Java öýjügini gaýtadan işlediň. / Complete all TODOs and rerun the Java cell."); return
    suffix = ".exe" if os.name == "nt" else ""
    roots = [JDK_HOME, os.environ.get("JAVA_HOME", "")]
    compiler = shutil.which("javac")
    if compiler: roots.append(str(Path(compiler).resolve().parent.parent))
    roots += [str(p) for p in sorted((Path.home()/".jdks").glob("*")) if p.is_dir()]
    tools = None
    for root in roots:
        if not root: continue
        java, javac = [Path(root)/"bin"/(name+suffix) for name in ("java", "javac")]
        if java.is_file() and javac.is_file():
            tools = (str(java),str(javac)); break
    if tools is None:
        print("未找到 JDK，请设置 JDK_HOME。/ JDK tapylmady; JDK_HOME bahasyny belläň. / JDK not found; set JDK_HOME."); return
    if FIXED_ANSWER and (not FIXED_ANSWER.isdigit() or not 1 <= int(FIXED_ANSWER) <= 20):
        print("固定答案应为 1–20 或空字符串。/ 1–20 aralygyndaky sany ýa-da boş setiri ulanyň. / Use 1–20 or an empty string."); return
    with tempfile.TemporaryDirectory(prefix="guess-game-") as folder:
        # 只在临时目录编译，避免使用旧的 class 文件。
        # Compile in a temporary folder to avoid stale class files.
        compiled = subprocess.run([tools[1], "-encoding", "UTF-8", "-d", folder, str(filename.resolve())],
                                  capture_output=True, text=True, encoding="utf-8", errors="replace")
        if compiled.returncode:
            print("编译失败 / Kompilýasiýa başa barmady / Compilation failed\\n" + compiled.stderr); return
        command = [tools[0], "-Dfile.encoding=UTF-8", "-cp", folder, "GuessNumberPractice"]
        if FIXED_ANSWER: command.append(FIXED_ANSWER)
        process = subprocess.Popen(command, stdin=subprocess.PIPE, stdout=subprocess.PIPE,
                                   stderr=subprocess.STDOUT, text=True, encoding="utf-8", errors="replace", bufsize=1)
        try:
            for line in process.stdout:
                if line.startswith("INPUT>"):
                    value = input(line.removeprefix("INPUT>").strip() + " ")
                    process.stdin.write(value + "\\n")
                    process.stdin.flush()
                else:
                    print(line, end="", flush=True)
            if process.wait() != 0:
                print("运行失败，请检查 Java 代码。/ Işletmek başa barmady; Java koduny barlaň. / Run failed; check the Java code.")
        except (KeyboardInterrupt, EOFError):
            print("\\n游戏已停止。/ Oýun bes edildi. / Game stopped.")
        finally:
            if process.poll() is None:
                process.terminate()
                try: process.wait(timeout=3)
                except subprocess.TimeoutExpired:
                    process.kill(); process.wait()
            process.stdin.close()
            process.stdout.close()

start_game()
'''
# Keep compatibility with Python 3.8 as well.
runner = runner.replace('line.removeprefix("INPUT>")','line[len("INPUT>"): ]')
def md(s): return dict(cell_type='markdown',metadata={},source=s)
def code(s): return dict(cell_type='code',metadata={},source=s,outputs=[],execution_count=None)
notes = (ROOT/'学习说明.md').read_text(encoding='utf-8')
head, tail = notes.split('## 4. 自测任务 / Самопроверка / Self-check tasks / Özbaşdak barlag')
cells = [md(head),md('## Java 填空 / Заполните код Java / Java exercise / Java koduny dolduryň\n\n填写下面的 24 个 TODO 后运行此单元，将代码保存到当前工作目录。首行是 notebook 保存文件的指令，请保留。\nЗаполните 24 пропуска TODO и выполните ячейку, чтобы сохранить Java-файл. Сохраните первую строку команды записи файла.\n\n24 TODO boşlugyny dolduryň we Java faýlyny saklamak üçin bu öýjügi işlediň. Faýly ýazýan birinji setiri saklaň.\n\nFill the 24 TODOs and run this cell to save the Java source in the current working directory. Keep the first line, which is a notebook file-writing command.'),code('%%writefile GuessNumberPractice.java\n'+student),md('## 开始游戏 / Начать игру / Start the game / Oýny başlat\n\n先保存上一单元，再运行下一单元，并在出现的输入框中作答。若要重玩，重新运行下一单元。若要固定答案进行自测，把 FIXED_ANSWER 设置为 "12"。\nВыполните предыдущую ячейку для сохранения кода, затем следующую для запуска игры. Отвечайте в поле ввода. Для новой игры запустите ячейку повторно. Для проверки задайте FIXED_ANSWER = "12".\n\nÖňki öýjügi işledip kody saklaň, soň indiki öýjügi işlediň we giriş meýdanynda jogap beriň. Täzeden oýnamak üçin öýjügi gaýtadan işlediň. Barlag üçin FIXED_ANSWER bahasyny "12" ediň.\n\nSave the previous cell, then run the next one and respond in its input boxes. Rerun the next cell to play again. Set FIXED_ANSWER to "12" for reproducible self-checks.'),code(runner),md('## 4. 自测任务 / Самопроверка / Self-check tasks / Özbaşdak barlag'+tail)]
for i,c in enumerate(cells): c['id']=f'guess-{i}'
notebook = dict(cells=cells,metadata=dict(kernelspec=dict(display_name='Python 3 (ipykernel)',language='python',name='python3'),language_info=dict(name='python')),nbformat=4,nbformat_minor=5)
for name in ['类与对象_猜数字游戏_四语TODO.ipynb', '类与对象_猜数字游戏_双语TODO.ipynb']:
    (ROOT/name).write_text(json.dumps(notebook,ensure_ascii=False,indent=1),encoding='utf-8')

# Compile and run actual console interactions, including boundary and invalid inputs.
jdk = next(p for p in sorted((Path.home()/'.jdks').glob('*')) if (p/'bin/javac.exe').exists())
with tempfile.TemporaryDirectory(prefix='guess-check-') as tmp:
    javafile = Path(tmp)/'GuessNumberPractice.java'
    javafile.write_text(answer,encoding='utf-8')
    subprocess.run([str(jdk/'bin/javac.exe'),'-encoding','UTF-8','-d',tmp,str(javafile)],check=True,capture_output=True)
    scenarios = [
        ('win','8\n16\n12\n',['Too low!','Too high!','You won!','Attempts: 3']),
        ('loss','1\n2\n3\n4\n5\n',['No attempts left!','Answer: 12']),
        ('invalid','abc\n21\n-1\n12\n',['Please enter an integer.','Out of range','Attempts: 1']),
        ('quit','0\n',['Game stopped.','Attempts used: 0']),
        ('final_win','1\n2\n3\n4\n12\n',['You won!','Attempts: 5']),
        ('empty_and_overflow','\n99999999999999999999\n12\n',['Please enter an integer.','Attempts: 1']),
        ('eof','',['Game stopped.','Attempts used: 0'])]
    report=[]
    for label, inputs, expected in scenarios:
        result=subprocess.run([str(jdk/'bin/java.exe'),'-Dfile.encoding=UTF-8','-cp',tmp,'GuessNumberPractice','12'],input=inputs,capture_output=True,text=True,encoding='utf-8',timeout=10)
        assert result.returncode==0,(label,result.stderr)
        assert all(s in result.stdout for s in expected),(label,result.stdout)
        report.append(label+' PASS')
    # Verify objects keep separate state, rather than accidentally using shared fields.
    harness='''class ObjectCheck {
        public static void main(String[] args) {
            GuessGame a = new GuessGame(12,5), b = new GuessGame(7,3);
            if(a.guess(8)!=-1 || a.getAttempts()!=1 || b.getAttempts()!=0) throw new AssertionError();
            if(b.guess(7)!=0 || !b.hasWon() || !b.isOver() || a.hasWon() || a.isOver()) throw new AssertionError();
            if(a.getRemaining()!=4 || b.getRemaining()!=2) throw new AssertionError();
        }
    }'''
    (Path(tmp)/'ObjectCheck.java').write_text(harness,encoding='utf-8')
    subprocess.run([str(jdk/'bin/javac.exe'),'-cp',tmp,'-d',tmp,str(Path(tmp)/'ObjectCheck.java')],check=True,capture_output=True)
    subprocess.run([str(jdk/'bin/java.exe'),'-cp',tmp,'ObjectCheck'],check=True,capture_output=True)
    report.append('independent_objects PASS')
    # Test the actual notebook bridge using supplied input callbacks; no Jupyter UI is needed.
    import os, builtins, contextlib, io
    previous = Path.cwd()
    try:
        os.chdir(tmp)
        iterator=iter(['8','16','12'])
        namespace={'input':lambda prompt: next(iterator)}
        with contextlib.redirect_stdout(io.StringIO()) as captured:
            exec(runner.replace('FIXED_ANSWER = ""','FIXED_ANSWER = "12"'),namespace)
        assert 'You won!' in captured.getvalue() and 'Attempts: 3' in captured.getvalue(),captured.getvalue()
        report.append('notebook_input_bridge PASS (script execution; UI not tested)')
    finally: os.chdir(previous)
assert len(set(re.findall(r'__TODO\d+__',student)))==24
(ROOT/'教师参考/验证记录.txt').write_text('\n'.join(report),encoding='utf-8')
print('\n'.join(report))
