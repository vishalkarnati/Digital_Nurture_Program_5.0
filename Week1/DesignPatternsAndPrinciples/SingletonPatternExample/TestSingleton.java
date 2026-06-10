package Week1.DesignPatternsAndPrinciples.SingletonPatternExample;

public class TestSingleton {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        System.out.println("Is logger1 equals to logger2: "+ (logger1 == logger2));
        System.out.println("Is logger2 equals to logger3: "+ (logger2 == logger3));
    }
}

