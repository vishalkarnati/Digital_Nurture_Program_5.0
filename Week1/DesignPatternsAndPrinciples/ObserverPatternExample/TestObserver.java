package Week1.DesignPatternsAndPrinciples.ObserverPatternExample;

public class TestObserver {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.register(mobile);
        stockMarket.register(web);

        stockMarket.setStockPrice(100);
        System.out.println();

        stockMarket.setStockPrice(150);
    }
}
