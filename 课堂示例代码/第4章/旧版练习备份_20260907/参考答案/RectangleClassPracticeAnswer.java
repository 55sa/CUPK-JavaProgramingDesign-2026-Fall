class RectanglePracticeModelAnswer {
    double width;
    double height;
    RectanglePracticeModelAnswer(double width, double height) { this.width = width; this.height = height; }
    double area() { return width * height; }
    double perimeter() { return 2 * (width + height); }
}

public class RectangleClassPracticeAnswer {
    public static void main(String[] args) {
        RectanglePracticeModelAnswer first = new RectanglePracticeModelAnswer(5, 3);
        RectanglePracticeModelAnswer second = new RectanglePracticeModelAnswer(8, 4);
        System.out.println(first.area() + ", " + first.perimeter());
        System.out.println(second.area() + ", " + second.perimeter());
    }
}
