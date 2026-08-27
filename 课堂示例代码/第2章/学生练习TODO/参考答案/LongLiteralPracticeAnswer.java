public class LongLiteralPracticeAnswer {
    public static void main(String[] args) {
        long millisecondsPerDay = 24L * 60 * 60 * 1000;
        long millisecondsPerYear = millisecondsPerDay * 365;

        System.out.println("一天的毫秒数：" + millisecondsPerDay);
        System.out.println("一年的毫秒数：" + millisecondsPerYear);
    }
}
