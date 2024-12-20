package Patterns.Strategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() { // Реализация поведения для уток которые не умеют летать
        System.out.println("I can`t fly");
    }
}
