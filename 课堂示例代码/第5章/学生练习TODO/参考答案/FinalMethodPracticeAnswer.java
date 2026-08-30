class FinalParentPracticeAnswer {
    final void rule() {
        System.out.println("This rule cannot be overridden");
    }
}

class FinalChildPracticeAnswer extends FinalParentPracticeAnswer {
    void show() {
        System.out.println("Child method");
    }
}

public class FinalMethodPracticeAnswer {
    public static void main(String[] args) {
        FinalChildPracticeAnswer child = new FinalChildPracticeAnswer();
        child.rule();
        child.show();
    }
}
