public class Test {
    public static void main(String[] args) {
        PhonePePayment phonePePayment = new PhonePePayment();
        PaytmPayment paytmPayment = new PaytmPayment();

        PaymentProcessor phonePeAdapter = new PhonePeAdapter(phonePePayment);
        PaymentProcessor paytmAdapter = new PaytmAdapter(paytmPayment);

        phonePeAdapter.processPayment(2000);
        paytmAdapter.processPayment(5000);
    }
}
