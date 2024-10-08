import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public StockMarket(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void
    removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);

        }
    }
}