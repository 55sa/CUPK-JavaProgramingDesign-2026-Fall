public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 3;

        while (count < 3) {
            System.out.println("while 执行");
        }

        do {
            System.out.println("do-while 至少执行一次，count = " + count);
        } while (count < 3);
    }
}
