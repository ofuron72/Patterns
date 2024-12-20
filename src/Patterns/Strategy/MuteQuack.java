package Patterns.Strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("  silence*   ");
    }
}
