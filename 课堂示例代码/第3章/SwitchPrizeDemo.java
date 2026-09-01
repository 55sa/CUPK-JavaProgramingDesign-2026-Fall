import java.util.Scanner;

public class SwitchPrizeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入中奖号码：");
        int number = input.nextInt();

        switch (number) {
            case 9:
                System.out.println("一等奖");
                break;
            case 131:
                System.out.println("二等奖");
                break;
            case 209:
            case 875:
                System.out.println("三等奖");
                break;
            default:
                System.out.println("未中奖");
        }

        input.close();
    }
}
