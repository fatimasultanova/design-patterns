package creational;

public class CoffeeMachine {

    private String coffee;
    private int size;
    private String liquid;
    private boolean art;
    private boolean sugar;
    private String syrup;
    public CoffeeMachine(CoffeeMachineBuilder builder) {
        this.coffee = builder.coffee;
        this.liquid = builder.liquid;
        this.size = builder.size;
        this.art = builder.art;
        this.syrup = builder.syrup;
        this.sugar = builder.sugar;

    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "coffee='" + coffee + '\'' +
                ", size=" + size +
                ", liquid='" + liquid + '\'' +
                ", art=" + art +
                ", sugar=" + sugar +
                ", syrup='" + syrup + '\'' +
                '}';
    }

    public static class CoffeeMachineBuilder{
        private String coffee;
        private int size;
        private String liquid;
        private boolean art;
        private boolean sugar;
        private String syrup;

        public CoffeeMachineBuilder(String coffee, String liquid) {
            this.coffee = coffee;
            this.liquid = liquid;
        }

        public CoffeeMachineBuilder Coffee(String coffee) {
            this.coffee = coffee;
            return this;
        }

        public CoffeeMachineBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public CoffeeMachineBuilder setLiquid(String liquid) {
            this.liquid = liquid;
            return this;
        }

        public CoffeeMachineBuilder setArt(boolean art) {
            this.art = art;
            return this;
        }

        public CoffeeMachineBuilder setSugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public CoffeeMachineBuilder setSyrup(String syrup) {
            this.syrup = syrup;
            return this;
        }

        public CoffeeMachine build(){
            return new CoffeeMachine(this);
        }
    }
}
