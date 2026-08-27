public class IntDivisionPracticeAnswer {
    public static void main(String[] args) {
        int totalScore = 386;
        int students = 5;

        int integerAverage = totalScore / students;
        double decimalAverage = (double) totalScore / students;

        System.out.println("整数平均值：" + integerAverage);
        System.out.println("小数平均值：" + decimalAverage);
    }
}
