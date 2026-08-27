public class SumDebugPracticeAnswer {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("计算结果：" + sum);
        System.out.println("正确结果应为 5050 / Expected result: 5050");
    }
}
