import java.util.Scanner;

public class ScannerAverageDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        System.out.println("请输入若干数字，输入非数字结束：");
        while (input.hasNextDouble()) {
            sum += input.nextDouble();
            count++;
        }

        System.out.println("数量：" + count);
        System.out.println("总和：" + sum);
        if (count > 0) {
            System.out.println("平均值：" + sum / count);
        } else {
            System.out.println("没有输入数字");
        }

        input.close();
    }
}
