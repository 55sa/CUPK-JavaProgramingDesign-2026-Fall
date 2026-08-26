public class CommandLinePractice {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("请在命令行中输入姓名参数。 / Please provide a name.");
            return;
        }

        System.out.println("欢迎，" + args[0] + "！");
    }
}
