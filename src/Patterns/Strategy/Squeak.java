package Patterns.Strategy;

public class Squeak implements QuackBehavior{ //это резиновые утки

    @Override
    public void quack() {
        System.out.println("Squeak");//писк резиновых уток
    }
}
