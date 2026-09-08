class CounterStudentModelAnswer {
    static int count = 0;
    String name;
    CounterStudentModelAnswer(String name) { this.name = name; count++; }
}

public class StaticCounterPracticeAnswer {
    public static void main(String[] args) {
        new CounterStudentModelAnswer("A");
        new CounterStudentModelAnswer("B");
        new CounterStudentModelAnswer("C");
        System.out.println(CounterStudentModelAnswer.count);
    }
}
