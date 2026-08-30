class InheritancePerson {
    protected String name;
    protected int age;

    InheritancePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println(name + ", " + age);
    }
}

class InheritanceStudent extends InheritancePerson {
    private String studentId;

    InheritanceStudent(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void study() {
        System.out.println(name + " is studying, ID=" + studentId);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        InheritanceStudent student = new InheritanceStudent("Li Ming", 19, "S1001");
        student.showInfo();
        student.study();
    }
}
