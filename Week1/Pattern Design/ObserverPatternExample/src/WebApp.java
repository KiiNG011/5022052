public class WebApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Web App: Price changed to " + price);
    }
}