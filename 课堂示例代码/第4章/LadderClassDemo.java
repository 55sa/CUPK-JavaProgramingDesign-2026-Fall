class DemoLadder {
    double above;
    double bottom;
    double height;

    double area() {
        return (above + bottom) * height / 2;
    }

    void showArea() {
        System.out.println("梯形面积：" + area());
    }
}

public class LadderClassDemo {
    public static void main(String[] args) {
        DemoLadder ladder = new DemoLadder();
        ladder.above = 3.0;
        ladder.bottom = 5.0;
        ladder.height = 4.0;
        ladder.showArea();
    }
}
