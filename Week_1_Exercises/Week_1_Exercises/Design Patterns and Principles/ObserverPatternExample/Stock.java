package ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

interface Stock {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers;
    private double stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void changeStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyAllObservers();
    }
}

interface Observer {
    void update(double stockPrice);
}

class MobileApp implements Observer {
    public void update(double stockPrice) {
        System.out.println("Mobile App: Stock price updated to " + stockPrice);
    }
}

class WebApp implements Observer {
    public void update(double stockPrice) {
        System.out.println("Web App: Stock price updated to " + stockPrice);
    }
}
