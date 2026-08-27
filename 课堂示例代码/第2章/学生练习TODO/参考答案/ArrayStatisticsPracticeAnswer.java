public class ArrayStatisticsPracticeAnswer {
    public static void main(String[] args) {
        int[] scores = {88, 92, 76, 95, 81};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }

        System.out.println("总分：" + sum);
        System.out.println("平均分：" + average);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);

        System.out.print("逆序输出：");
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
}
