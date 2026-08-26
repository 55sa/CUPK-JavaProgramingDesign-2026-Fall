import java.util.Scanner;

public class ScannerRectanglePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入长和宽：");
        double length = input.nextDouble();
        double width = input.nextDouble();

        // TODO：填写面积和周长计算公式。
        // TODO: Fill in the formulas for area and perimeter.
        double area = 0.0;
        double perimeter = 0.0;

        System.out.println("面积：" + area);
        System.out.println("周长：" + perimeter);

        input.close();
    }
}
