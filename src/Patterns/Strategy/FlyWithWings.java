package Patterns.Strategy;

public class FlyWithWings implements FlyBehavior{
    public void fly(){// Реализация поведения для уток которые умеют летать
        System.out.println("I`m flying!");
    }
}
