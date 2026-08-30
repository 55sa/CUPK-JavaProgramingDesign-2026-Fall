interface DemoLogger {
    default void log(String message) {
        System.out.println("LOG: " + message);
    }

    static String version() {
        return "1.0";
    }
}

class DemoConsoleLogger implements DemoLogger {
}

public class DefaultStaticMethodDemo {
    public static void main(String[] args) {
        DemoConsoleLogger logger = new DemoConsoleLogger();
        logger.log("program started");
        System.out.println(DemoLogger.version());
    }
}
