interface CallbackGreeting {
    void greet(String name);
}

class ChineseGreeting implements CallbackGreeting {
    @Override
    public void greet(String name) {
        System.out.println("你好，" + name);
    }
}

class EnglishGreeting implements CallbackGreeting {
    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

public class InterfaceCallbackDemo {
    static void runGreeting(CallbackGreeting greeting, String name) {
        greeting.greet(name);
    }

    public static void main(String[] args) {
        runGreeting(new ChineseGreeting(), "Li Ming");
        runGreeting(new EnglishGreeting(), "Li Ming");
    }
}
