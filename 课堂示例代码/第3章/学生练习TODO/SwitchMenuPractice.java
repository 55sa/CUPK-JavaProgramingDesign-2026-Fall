import java.util.Scanner;

public class SwitchMenuPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. 查看课程  2. 查看作业  3. 退出");
        int choice = input.nextInt();

        // TODO：使用 switch 输出对应功能；其他数字输出“无效选择”。

        input.close();
    }
}
