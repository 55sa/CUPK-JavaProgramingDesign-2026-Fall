@FunctionalInterface
interface HelloSpeaker {
    void sayHello(String name);
}

class ChineseSpeaker implements HelloSpeaker {
    @Override
    public void sayHello(String name) {
        System.out.println("你好，" + name);
    }
}

class EnglishSpeaker implements HelloSpeaker {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

public class InterfaceParameterDemo {
    static void lookHello(HelloSpeaker speaker, String name) {
        speaker.sayHello(name);
    }

    public static void main(String[] args) {
        lookHello(new ChineseSpeaker(), "Li Ming");
        lookHello(new EnglishSpeaker(), "Li Ming");
        lookHello(name -> System.out.println("Bonjour, " + name), "Li Ming");
    }
}
