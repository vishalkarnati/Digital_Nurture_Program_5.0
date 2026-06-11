package Week1.DesignPatternsAndPrinciples.ProxyPatternExample;

public class TestProxy {

    public static void main(String[] args) {

        Image image = new ProxyImage("nature.jpg");
        System.out.println("Image object created");
        System.out.println();

        image.display();
        System.out.println();

        image.display();
    }
}
