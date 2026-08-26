public class ConversionPractice {
    public static void main(String[] args) {
        int wholeNumber = 125;
        double decimalNumber = 34.89;

        double widened = wholeNumber;
        int narrowed = (int) decimalNumber;

        System.out.println("自动转换结果：" + widened);
        System.out.println("强制转换结果：" + narrowed);
    }
}
