public class CommandLinePractice {
    public static void main(String[] args) {
        // TODO：运行时传入一个姓名，例如：java CommandLinePractice Alice
        // TODO: Pass a name when running, for example: java CommandLinePractice Alice
        if (args.length == 0) {
            System.out.println("请在命令行中输入姓名参数。 / Please provide a name.");
            return;
        }

        // TODO：使用 args[0] 输出“欢迎，姓名！”
        // TODO: Use args[0] to print "Welcome, name!"
        System.out.println("欢迎，" + args[0] + "！");
    }
}
