interface LoggerPracticeAnswer {
    default void log(String message) {
        System.out.println("LOG: " + message);
    }

    static String version() {
        return "1.0";
    }
}

class ConsoleLoggerPracticeAnswer implements LoggerPracticeAnswer {
}

public class DefaultStaticInterfacePracticeAnswer {
    public static void main(String[] args) {
        new ConsoleLoggerPracticeAnswer().log("started");
        System.out.println(LoggerPracticeAnswer.version());
    }
}
