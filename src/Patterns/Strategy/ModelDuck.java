package Patterns.Strategy;

public class ModelDuck extends Duck{    //приманка
    public ModelDuck(){
        flyBehavior = new FlyNoWay();//изначально не летает
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I`m a model duck");
    }
}
