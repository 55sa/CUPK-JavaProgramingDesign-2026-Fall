import java.util.Scanner;

public class LoopMathPracticeAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("输入无效");
            input.close();
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        long factorial = 1;
        int i = 1;
        while (i <= n) factorial *= i++;
        System.out.println("和：" + sum);
        System.out.println("阶乘：" + factorial);
        input.close();
    }
}
