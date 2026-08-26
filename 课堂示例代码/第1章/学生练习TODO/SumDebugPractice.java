public class SumDebugPractice {
    public static void main(String[] args) {
        int sum = 0;

        // TODO：修改循环的起始值、结束条件和更新表达式，计算 1 到 100 的和。
        // TODO: Fix the start value, condition, and update expression to sum 1 through 100.
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("计算结果：" + sum);
        System.out.println("正确结果应为 5050 / Expected result: 5050");
    }
}
