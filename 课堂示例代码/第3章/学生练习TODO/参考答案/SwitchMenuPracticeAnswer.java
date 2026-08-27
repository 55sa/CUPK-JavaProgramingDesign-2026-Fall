import java.util.Scanner;

public class SwitchMenuPracticeAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. 查看课程  2. 查看作业  3. 退出");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("正在显示课程");
                break;
            case 2:
                System.out.println("正在显示作业");
                break;
            case 3:
                System.out.println("程序结束");
                break;
            default:
                System.out.println("无效选择");
        }
        input.close();
    }
}
