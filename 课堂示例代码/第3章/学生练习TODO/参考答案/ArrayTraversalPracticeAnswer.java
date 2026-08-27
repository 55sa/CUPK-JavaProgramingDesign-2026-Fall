public class ArrayTraversalPracticeAnswer {
    public static void main(String[] args) {
        int[] values = {12, 7, 25, 9, 18};
        for (int i = 0; i < values.length; i++) System.out.print(values[i] + " ");
        System.out.println();
        int sum = 0;
        for (int value : values) sum += value;
        System.out.println("总和：" + sum);
        for (int i = values.length - 1; i >= 0; i--) System.out.print(values[i] + " ");
        System.out.println();
    }
}
