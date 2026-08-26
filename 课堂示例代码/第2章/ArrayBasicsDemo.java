import java.util.Arrays;

public class ArrayBasicsDemo {
    public static void main(String[] args) {
        int[] scores = {86, 92, 75, 88, 95};

        System.out.println("数组长度：" + scores.length);
        System.out.println("原数组：" + Arrays.toString(scores));

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
            sum += scores[i];
        }

        double average = (double) sum / scores.length;
        System.out.printf("平均分：%.1f%n", average);
    }
}

