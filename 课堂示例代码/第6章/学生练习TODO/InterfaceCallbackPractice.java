interface CallbackTaskPractice {
    void run(String value);
}

class UppercaseTaskPractice implements CallbackTaskPractice {
    @Override
    public void run(String value) {
        // TODO 1: 输出大写字符串。
    }
}

public class InterfaceCallbackPractice {
    static void execute(CallbackTaskPractice task, String value) {
        // TODO 2: 回调 task.run(value)。
    }

    public static void main(String[] args) {
        // TODO 3: 创建实现类并传入 execute()。
    }
}
