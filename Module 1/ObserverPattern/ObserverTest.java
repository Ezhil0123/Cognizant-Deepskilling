public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobileUser = new MobileApp("John Doe");
        Observer webUser = new WebApp("Alice");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        System.out.println("Stock price updated");

        stockMarket.setStockPrice("AAPL", 150.0);

        System.out.println();

        stockMarket.setStockPrice("GOOGL", 2800.0);
    }
}
