class ConstructorStudentModelAnswer {
    String name;
    int age;
    ConstructorStudentModelAnswer() { name = "Unknown"; age = 0; }
    ConstructorStudentModelAnswer(String name, int age) { this.name = name; this.age = age; }
    void introduce() { System.out.println(name + ", " + age); }
}

public class StudentConstructorPracticeAnswer {
    public static void main(String[] args) {
        new ConstructorStudentModelAnswer().introduce();
        new ConstructorStudentModelAnswer("Li Ming", 18).introduce();
    }
}
