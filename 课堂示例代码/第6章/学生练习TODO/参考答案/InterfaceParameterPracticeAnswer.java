@FunctionalInterface
interface GreetingPracticeAnswer {
    void sayHello(String name);
}

class ChineseGreetingPracticeAnswer implements GreetingPracticeAnswer {
    @Override
    public void sayHello(String name) {
        System.out.println("你好，" + name);
    }
}

class EnglishGreetingPracticeAnswer implements GreetingPracticeAnswer {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

public class InterfaceParameterPracticeAnswer {
    static void lookHello(GreetingPracticeAnswer greeting, String name) {
        greeting.sayHello(name);
    }

    public static void main(String[] args) {
        lookHello(new ChineseGreetingPracticeAnswer(), "Li Ming");
        lookHello(new EnglishGreetingPracticeAnswer(), "Li Ming");
        lookHello(name -> System.out.println("Bonjour, " + name), "Li Ming");
    }
}
