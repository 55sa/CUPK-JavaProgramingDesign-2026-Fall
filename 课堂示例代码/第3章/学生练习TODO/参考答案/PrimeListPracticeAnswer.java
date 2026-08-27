public class PrimeListPracticeAnswer {
    public static void main(String[] args) {
        int limit = 100;
        for (int number = 2; number <= limit; number++) {
            boolean prime = true;
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(number + " ");
        }
        System.out.println();
    }
}
