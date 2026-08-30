interface DemoPrintable {
    void print();
}

class DemoPrinter implements DemoPrintable {
    @Override
    public void print() {
        System.out.println("Printing through an interface");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        DemoPrintable printable = new DemoPrinter();
        printable.print();
    }
}
