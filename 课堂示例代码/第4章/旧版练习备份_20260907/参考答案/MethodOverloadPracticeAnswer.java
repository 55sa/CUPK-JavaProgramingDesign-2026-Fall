class AreaCalculatorPracticeModelAnswer {
    int area(int side) { return side * side; }
    int area(int width, int height) { return width * height; }
    double area(double radius) { return Math.PI * radius * radius; }
}

public class MethodOverloadPracticeAnswer {
    public static void main(String[] args) {
        AreaCalculatorPracticeModelAnswer calculator = new AreaCalculatorPracticeModelAnswer();
        System.out.println(calculator.area(5));
        System.out.println(calculator.area(5, 3));
        System.out.println(calculator.area(2.5));
    }
}
