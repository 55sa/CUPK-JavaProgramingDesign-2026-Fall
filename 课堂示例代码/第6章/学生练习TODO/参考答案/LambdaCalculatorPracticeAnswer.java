@FunctionalInterface
interface CalculatorPracticeAnswer {
    int calculate(int a, int b);
}

public class LambdaCalculatorPracticeAnswer {
    public static void main(String[] args) {
        CalculatorPracticeAnswer add = (a, b) -> a + b;
        CalculatorPracticeAnswer multiply = (a, b) -> a * b;
        System.out.println(add.calculate(6, 4));
        System.out.println(multiply.calculate(6, 4));
    }
}
