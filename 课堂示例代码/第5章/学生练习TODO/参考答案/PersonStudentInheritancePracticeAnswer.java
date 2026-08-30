class PersonPracticeBaseAnswer {
    protected String name;
    protected int age;

    PersonPracticeBaseAnswer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class StudentPracticeChildAnswer extends PersonPracticeBaseAnswer {
    private String studentId;

    StudentPracticeChildAnswer(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void showInfo() {
        System.out.println(name + ", " + age + ", " + studentId);
    }
}

public class PersonStudentInheritancePracticeAnswer {
    public static void main(String[] args) {
        new StudentPracticeChildAnswer("Li Ming", 19, "S1001").showInfo();
    }
}
