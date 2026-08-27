class DemoStudent {
    String name;
    int age;

    DemoStudent() {
        name = "Unknown";
        age = 0;
    }

    DemoStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println(name + ", " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        DemoStudent first = new DemoStudent();
        DemoStudent second = new DemoStudent("Li Ming", 18);
        first.introduce();
        second.introduce();
    }
}
