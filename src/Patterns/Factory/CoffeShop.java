package Patterns.Factory;

public class CoffeShop {
    private final SimpleCoffeeFactory coffeeFactory;

    public CoffeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type){
        Coffee coffee = coffeeFactory.createCoffee(type);


        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе");
        return coffee;
    }
}
