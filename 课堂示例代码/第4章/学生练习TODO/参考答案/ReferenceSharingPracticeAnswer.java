class ReferenceBoxModelAnswer { int value; }

public class ReferenceSharingPracticeAnswer {
    public static void main(String[] args) {
        ReferenceBoxModelAnswer first = new ReferenceBoxModelAnswer();
        ReferenceBoxModelAnswer second = new ReferenceBoxModelAnswer();
        first.value = 10;
        second.value = 20;
        second = first;
        second.value = 99;
        System.out.println(first.value + ", " + second.value);
    }
}
