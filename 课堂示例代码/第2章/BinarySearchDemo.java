import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] data = {3, 8, 12, 17, 25, 31, 46, 59, 72};
        int target = 31;

        System.out.println("数组：" + Arrays.toString(data));
        int index = binarySearch(data, target);

        if (index >= 0) {
            System.out.println("找到 " + target + "，下标是 " + index);
        } else {
            System.out.println("没有找到 " + target);
        }
    }

    static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.printf("low=%d, high=%d, mid=%d, data[mid]=%d%n",
                    low, high, mid, data[mid]);

            if (data[mid] == target) {
                return mid;
            } else if (target < data[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}

