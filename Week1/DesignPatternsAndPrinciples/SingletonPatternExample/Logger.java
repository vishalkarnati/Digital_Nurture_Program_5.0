package Week1.DesignPatternsAndPrinciples.SingletonPatternExample;

public class Logger {

    private static Logger instance;

    // Private Constructor
    private Logger() {
        System.out.println("Logger Created");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}