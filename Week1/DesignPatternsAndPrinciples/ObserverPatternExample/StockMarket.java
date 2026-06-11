package Week1.DesignPatternsAndPrinciples.ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {

    private List<Observer> observers = new ArrayList<>();

    private double stockPrice;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
