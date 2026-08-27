import java.util.Scanner;

public class ScannerRectanglePracticeAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入长和宽：");
        double length = input.nextDouble();
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("面积：" + area);
        System.out.println("周长：" + perimeter);

        input.close();
    }
}
