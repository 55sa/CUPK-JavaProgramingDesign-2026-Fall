import java.util.Scanner;

public class ScannerSumDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("请输入数字，输入 0 结束：");
        double value = input.nextDouble();

        while (value != 0) {
            sum += value;
            count++;
            value = input.nextDouble();
        }

        System.out.printf("共输入 %d 个数，总和为 %.2f%n", count, sum);
        input.close();
    }
}

