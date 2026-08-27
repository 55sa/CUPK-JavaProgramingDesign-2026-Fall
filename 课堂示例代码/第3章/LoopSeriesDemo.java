public class LoopSeriesDemo {
    public static void main(String[] args) {
        long item = 0;
        long sum = 0;

        for (int i = 1; i <= 8; i++) {
            item = item * 10 + 8;
            sum += item;
            System.out.println("第 " + i + " 项：" + item + "，当前和：" + sum);
        }
    }
}
