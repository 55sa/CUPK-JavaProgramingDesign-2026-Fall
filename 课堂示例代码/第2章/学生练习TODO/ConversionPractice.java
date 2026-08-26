public class ConversionPractice {
    public static void main(String[] args) {
        int wholeNumber = 125;
        double decimalNumber = 34.89;

        // TODO 1：把 wholeNumber 自动转换为 double。
        // TODO 1: Convert wholeNumber to double automatically.
        double widened = 0.0;

        // TODO 2：把 decimalNumber 强制转换为 int。
        // TODO 2: Explicitly cast decimalNumber to int.
        int narrowed = 0;

        System.out.println("自动转换结果：" + widened);
        System.out.println("强制转换结果：" + narrowed);
    }
}
