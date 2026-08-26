public class DebugDemo {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            total = total + i; // 在这一行设置断点
            System.out.println("i = " + i + ", total = " + total);
        }

        System.out.println("最终结果：" + total);
    }
}

