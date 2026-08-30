class SuperParent {
    SuperParent(String message) {
        System.out.println("Parent constructor: " + message);
    }

    void greet() {
        System.out.println("Hello from parent");
    }
}

class SuperChild extends SuperParent {
    SuperChild() {
        super("called by child");
        System.out.println("Child constructor");
    }

    @Override
    void greet() {
        super.greet();
        System.out.println("Hello from child");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        new SuperChild().greet();
    }
}
