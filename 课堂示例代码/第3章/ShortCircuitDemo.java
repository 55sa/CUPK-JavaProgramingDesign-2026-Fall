public class ShortCircuitDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean first = x < 20 || (y = 100) > 50;
        System.out.println("first = " + first + ", y = " + y);

        boolean second = x > 20 && (y = 200) > 50;
        System.out.println("second = " + second + ", y = " + y);
    }
}
