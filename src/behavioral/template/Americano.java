package behavioral.template;

public class Americano extends Coffee{
    @Override
    void boilWater() {
        System.out.println("americano");
    }

    @Override
    void filterCoffee() {
        System.out.println("americano");
    }

    @Override
    void mix() {
        System.out.println("americano");
    }

    @Override
    void pour() {
        System.out.println("americano");
    }
}
