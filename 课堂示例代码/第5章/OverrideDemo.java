class OverrideEmployee {
    protected String name;

    OverrideEmployee(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Employee: " + name);
    }
}

class OverrideManager extends OverrideEmployee {
    OverrideManager(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Manager: " + name);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        OverrideEmployee employee = new OverrideEmployee("Wang");
        OverrideEmployee manager = new OverrideManager("Zhao");
        employee.showInfo();
        manager.showInfo();
    }
}
