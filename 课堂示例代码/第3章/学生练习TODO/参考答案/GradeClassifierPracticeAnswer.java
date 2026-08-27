import java.util.Scanner;

public class GradeClassifierPracticeAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score < 0 || score > 100) System.out.println("输入无效");
        else if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else System.out.println("F");
        input.close();
    }
}
