package ObserverPatternExample;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobile = new Mobile();
        Observer web = new Web();

        stockMarket.register(mobile);
        stockMarket.register(web);

        stockMarket.setStockPrice(12.0); 
    }
}
