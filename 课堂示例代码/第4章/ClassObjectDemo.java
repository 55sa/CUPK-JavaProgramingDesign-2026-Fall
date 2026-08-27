class DemoRectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        DemoRectangle first = new DemoRectangle();
        first.width = 5;
        first.height = 3;

        DemoRectangle second = new DemoRectangle();
        second.width = 8;
        second.height = 4;

        System.out.println("first area = " + first.area());
        System.out.println("second area = " + second.area());
    }
}
