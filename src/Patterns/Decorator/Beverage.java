package Patterns.Decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }//уже реализован

    public abstract double cost();
}
