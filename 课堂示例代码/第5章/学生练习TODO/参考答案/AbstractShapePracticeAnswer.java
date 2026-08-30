abstract class ShapePracticeBaseAnswer {
    abstract double area();
}

class CirclePracticeChildAnswer extends ShapePracticeBaseAnswer {
    private double radius;

    CirclePracticeChildAnswer(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class RectanglePracticeChildAnswer extends ShapePracticeBaseAnswer {
    private double width;
    private double height;

    RectanglePracticeChildAnswer(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class AbstractShapePracticeAnswer {
    public static void main(String[] args) {
        ShapePracticeBaseAnswer[] shapes = {
            new CirclePracticeChildAnswer(2), new RectanglePracticeChildAnswer(3, 4)
        };
        for (ShapePracticeBaseAnswer shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
