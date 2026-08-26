public class BinarySearchPractice {
    static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 8, 12, 17, 25, 31, 46, 59};
        

        System.out.println("查找 31：" + binarySearch(data, 31));
        System.out.println("查找 30：" + binarySearch(data, 30));
    }
}
