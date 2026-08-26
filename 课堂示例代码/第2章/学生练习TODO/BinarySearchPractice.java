public class BinarySearchPractice {
    static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        // TODO：补全 while 循环、mid 计算和 low/high 更新逻辑。
        // TODO: Complete the while loop, mid calculation, and low/high updates.

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 8, 12, 17, 25, 31, 46, 59};

        System.out.println("查找 31：" + binarySearch(data, 31));
        System.out.println("查找 30：" + binarySearch(data, 30));
    }
}
