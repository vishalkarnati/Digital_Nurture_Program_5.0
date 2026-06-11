package Week1.DesignPatternsAndPrinciples.StrategyPatternExample;

public class TestStrategy {

    public static void main(String[] args) {

        PaymentContext context;

        context = new PaymentContext(new CreditCardPayment());
        context.executePayment(1000);

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(2000);
    }
}
