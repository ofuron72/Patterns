package Patterns.Strategy;

public class FlyRocketPowered implements FlyBehavior{   //Реактивный полёт
    @Override
    public void fly() {
        System.out.println("I`m flying with a rocket!");
    }
}
