package behavioral.strategy;

public class PaymentProcess {
    private final Payment payment;

    public PaymentProcess(Payment payment){
        this.payment = payment;
    }

    public void payment(double amount) {
        payment.pay(amount);
    }
}
