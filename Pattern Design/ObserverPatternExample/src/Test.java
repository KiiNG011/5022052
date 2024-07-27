public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket(100);

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(120);
        stockMarket.setPrice(80);
    }
}
