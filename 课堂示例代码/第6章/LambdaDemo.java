@FunctionalInterface
interface IntOperation {
    int apply(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        IntOperation add = (a, b) -> a + b;
        IntOperation multiply = (a, b) -> a * b;
        System.out.println(add.apply(6, 4));
        System.out.println(multiply.apply(6, 4));
    }
}
