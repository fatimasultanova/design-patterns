package behavioral.strategy;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("CreditCard: " + amount);
    }
}
