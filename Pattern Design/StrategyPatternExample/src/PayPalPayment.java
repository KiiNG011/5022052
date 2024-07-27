public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    // Constructor with PayPal credentials
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with PayPal");
        // Here, you would typically process the payment using PayPal credentials
    }
}