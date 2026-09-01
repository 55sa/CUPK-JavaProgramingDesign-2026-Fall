abstract class PillarGeometry {
    abstract double area();
}

class PillarCircle extends PillarGeometry {
    private double radius;

    PillarCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class PillarRectangle extends PillarGeometry {
    private double width;
    private double height;

    PillarRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class DemoPillar {
    private PillarGeometry bottom;
    private double height;

    DemoPillar(PillarGeometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    double volume() {
        return bottom.area() * height;
    }
}

public class PillarOpenClosedDemo {
    public static void main(String[] args) {
        DemoPillar roundPillar = new DemoPillar(new PillarCircle(2), 5);
        DemoPillar boxPillar = new DemoPillar(new PillarRectangle(3, 4), 5);
        System.out.println("圆底柱体体积：" + roundPillar.volume());
        System.out.println("矩形底柱体体积：" + boxPillar.volume());
    }
}
