package Week1.DesignPatternsAndPrinciples.BuilderPatternExample;

public class TestBuilder {

    public static void main(String[] args) {

        Computer computer =
            new Computer.Builder()
                .cpu("Intel i5")
                .ram(8)
                .storage(256)
                .build();

        computer.display();
    }
}
