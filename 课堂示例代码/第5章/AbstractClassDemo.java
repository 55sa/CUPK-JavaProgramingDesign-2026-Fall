abstract class AbstractShape {
    abstract double area();
}

class AbstractCircle extends AbstractShape {
    private double radius;

    AbstractCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class AbstractRectangle extends AbstractShape {
    private double width;
    private double height;

    AbstractRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        AbstractShape[] shapes = {new AbstractCircle(2), new AbstractRectangle(3, 4)};
        for (AbstractShape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
