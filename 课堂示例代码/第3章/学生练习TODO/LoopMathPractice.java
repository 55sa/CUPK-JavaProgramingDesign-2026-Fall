import java.util.Scanner;

public class LoopMathPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // TODO：n 必须是正整数。
        int sum = 0;
        // TODO：使用 for 计算 1+2+…+n。

        long factorial = 1;
        // TODO：使用 while 计算 n!。

        System.out.println("和：" + sum);
        System.out.println("阶乘：" + factorial);
        input.close();
    }
}
