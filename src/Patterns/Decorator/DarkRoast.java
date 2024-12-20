package Patterns.Decorator;

public class DarkRoast extends Beverage {  //конкретный компонент
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.59;
    }
}
