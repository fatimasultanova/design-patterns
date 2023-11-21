package behavioral.template;

public class Latte extends Coffee{
    @Override
    void boilWater() {
        System.out.println("latte");
    }

    @Override
    void filterCoffee() {
        System.out.println("latte");
    }

    @Override
    void mix() {
        System.out.println("latte");
    }

    @Override
    void pour() {
        System.out.println("latte");
    }
}
