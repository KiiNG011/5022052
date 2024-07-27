public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String expiryDate;

    private String cvv;

    // Constructor with card details
    public CreditCardPayment(String name, String cardNumber, String expiryDate, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public
    void pay(double amount) {
        System.out.println(amount + " paid with credit card");
                // Here, you would typically process the payment using the card details
    }
}