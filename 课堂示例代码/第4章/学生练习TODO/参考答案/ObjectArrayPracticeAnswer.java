class ArrayStudentModelAnswer {
    String name;
    int score;
    ArrayStudentModelAnswer(String name, int score) { this.name = name; this.score = score; }
}

public class ObjectArrayPracticeAnswer {
    public static void main(String[] args) {
        ArrayStudentModelAnswer[] students = {
            new ArrayStudentModelAnswer("A", 88),
            new ArrayStudentModelAnswer("B", 92),
            new ArrayStudentModelAnswer("C", 80)
        };
        int sum = 0;
        for (ArrayStudentModelAnswer student : students) {
            System.out.println(student.name + ": " + student.score);
            sum += student.score;
        }
        System.out.println("平均分：" + (double) sum / students.length);
    }
}
