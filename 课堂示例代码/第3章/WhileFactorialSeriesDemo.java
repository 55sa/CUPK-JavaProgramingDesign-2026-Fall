public class WhileFactorialSeriesDemo {
    public static void main(String[] args) {
        int i = 1;
        double item = 1.0;
        double sum = 0.0;

        while (i <= 20) {
            if (i > 1) {
                item = item / i;
            }
            sum += item;
            i++;
        }

        System.out.println("1 + 1/2! + ... + 1/20! = " + sum);
    }
}
