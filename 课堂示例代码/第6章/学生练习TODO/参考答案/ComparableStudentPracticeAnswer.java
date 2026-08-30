import java.util.Arrays;

class ComparableStudentPracticeItemAnswer implements Comparable<ComparableStudentPracticeItemAnswer> {
    private String name;
    private int score;

    ComparableStudentPracticeItemAnswer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(ComparableStudentPracticeItemAnswer other) {
        return Integer.compare(score, other.score);
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class ComparableStudentPracticeAnswer {
    public static void main(String[] args) {
        ComparableStudentPracticeItemAnswer[] students = {
            new ComparableStudentPracticeItemAnswer("Li", 88),
            new ComparableStudentPracticeItemAnswer("Wang", 95),
            new ComparableStudentPracticeItemAnswer("Zhao", 76)
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
