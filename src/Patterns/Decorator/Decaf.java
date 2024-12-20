package Patterns.Decorator;

public class Decaf extends Beverage{//конкретный компонент
    public Decaf() {
        description = "Decaf beverage";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
