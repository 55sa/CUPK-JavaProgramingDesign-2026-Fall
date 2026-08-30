interface CallbackTaskPracticeAnswer {
    void run(String value);
}

class UppercaseTaskPracticeAnswer implements CallbackTaskPracticeAnswer {
    @Override
    public void run(String value) {
        System.out.println(value.toUpperCase());
    }
}

public class InterfaceCallbackPracticeAnswer {
    static void execute(CallbackTaskPracticeAnswer task, String value) {
        task.run(value);
    }

    public static void main(String[] args) {
        execute(new UppercaseTaskPracticeAnswer(), "hello callback");
    }
}
