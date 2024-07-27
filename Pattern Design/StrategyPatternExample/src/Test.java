public class Test {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay by credit card
        paymentContext.setPaymentStrategy(new CreditCardPayment("Kingshuk Roy", "1234567890123456", "12/28", "123"));
        paymentContext.pay(200);

        // Pay by PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("king@gmail.com", "password"));
        paymentContext.pay(150);
    }
}
