package Week1.DesignPatternsAndPrinciples.StrategyPatternExample;

public class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
