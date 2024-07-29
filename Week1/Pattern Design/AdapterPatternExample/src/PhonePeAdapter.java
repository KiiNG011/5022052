public class PhonePeAdapter implements PaymentProcessor{
    private final PhonePePayment phonePePayment;
    public PhonePeAdapter(PhonePePayment phonePePayment){
        this.phonePePayment = phonePePayment;
    }

    @Override
    public void processPayment(double amount) {
        phonePePayment.payWithPhonePe(amount);
    }
}
