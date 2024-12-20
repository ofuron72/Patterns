package Patterns.Factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(CoffeeType type){
        Coffee coffee = null;

        switch (type){
            case AMERICANO -> coffee = new Americano();
            case ESPRESSO -> coffee = new Espresso();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case CAFFE_LATTE -> coffee = new CaffeLatte();
        }

        return coffee;
    }
}
