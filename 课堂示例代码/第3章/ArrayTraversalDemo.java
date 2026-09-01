public class ArrayTraversalDemo {
    public static void main(String[] args) {
        int[] scores = {88, 76, 95, 83};

        System.out.println("传统 for：可以访问下标");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        System.out.println("增强 for：适合只读遍历");
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
