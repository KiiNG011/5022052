public class PaytmAdapter implements PaymentProcessor{
    private PaytmPayment paytmPayment;
    public PaytmAdapter(PaytmPayment paytmPayment){
        this.paytmPayment = paytmPayment;
    }
    @Override
    public void processPayment(double amount) {
        paytmPayment.payWithPaytm(amount);
    }
}
