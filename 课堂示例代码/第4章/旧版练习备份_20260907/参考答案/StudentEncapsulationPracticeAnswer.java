class EncapsulatedStudentModelAnswer {
    private String name;
    private int score;
    EncapsulatedStudentModelAnswer(String name, int score) { this.name = name; setScore(score); }
    String getName() { return name; }
    int getScore() { return score; }
    void setScore(int score) { if (score >= 0 && score <= 100) this.score = score; }
}

public class StudentEncapsulationPracticeAnswer {
    public static void main(String[] args) {
        EncapsulatedStudentModelAnswer student = new EncapsulatedStudentModelAnswer("Li Ming", 88);
        student.setScore(95);
        System.out.println(student.getName() + ": " + student.getScore());
    }
}
