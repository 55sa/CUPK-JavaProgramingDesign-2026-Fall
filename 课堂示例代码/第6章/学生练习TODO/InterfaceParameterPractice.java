@FunctionalInterface
interface GreetingPractice {
    void sayHello(String name);
}

class ChineseGreetingPractice implements GreetingPractice {
    @Override
    public void sayHello(String name) {
        // TODO 1: 输出中文问候语。
    }
}

class EnglishGreetingPractice implements GreetingPractice {
    @Override
    public void sayHello(String name) {
        // TODO 2: 输出英文问候语。
    }
}

public class InterfaceParameterPractice {
    static void lookHello(GreetingPractice greeting, String name) {
        // TODO 3: 用接口参数回调 sayHello()。
    }

    public static void main(String[] args) {
        // TODO 4: 依次传入中文对象、英文对象和一个 Lambda 表达式。
    }
}
