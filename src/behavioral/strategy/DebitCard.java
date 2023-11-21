package behavioral.strategy;

public class DebitCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("DebitCard: " + amount);
    }
}
