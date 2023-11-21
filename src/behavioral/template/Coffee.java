package behavioral.template;

public abstract class Coffee {
    public void prepareCoffee(){
        boilWater();
        filterCoffee();
        mix();
        pour();
    }

   abstract void boilWater();
   abstract void filterCoffee();
   abstract void mix();
   abstract void pour();
}
