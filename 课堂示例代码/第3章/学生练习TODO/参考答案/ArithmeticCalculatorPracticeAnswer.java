import java.util.Scanner;

public class ArithmeticCalculatorPracticeAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("加：" + (a + b));
        System.out.println("减：" + (a - b));
        System.out.println("乘：" + (a * b));
        if (b != 0) {
            System.out.println("除：" + (a / b));
            System.out.println("余：" + (a % b));
        } else {
            System.out.println("除数不能为 0");
        }
        input.close();
    }
}
