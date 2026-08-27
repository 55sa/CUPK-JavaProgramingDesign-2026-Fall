class DemoBox {
    int value;
}

public class ReferenceDemo {
    public static void main(String[] args) {
        DemoBox first = new DemoBox();
        first.value = 10;

        DemoBox second = new DemoBox();
        second.value = 20;
        System.out.println(first.value + ", " + second.value);

        second = first;
        second.value = 99;
        System.out.println(first.value + ", " + second.value);
    }
}
