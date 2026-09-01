public class BreakContinuePrimeDemo {
    public static void main(String[] args) {
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            oddSum += i;
        }
        System.out.println("1 到 100 的奇数和：" + oddSum);

        System.out.print("50 以内的素数：");
        for (int number = 2; number < 50; number++) {
            boolean prime = true;
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
