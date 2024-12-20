package Patterns.Strategy;

public class MallardDuck extends Duck{

    public MallardDuck() {   //Mallard это кряква*
                            //MallardDuck наследует переменные quackBehavior и flyBehavior от класса Duck

        quackBehavior = new Quack();/* Mallard Duck использует класс Quack для выполнения действия,
        так что при вызове performQuake() ответственность за выполнение возлагается на объект Quack
        */
        flyBehavior = new FlyWithWings();/* В качестве реализации flyBehavior используется тип FlyWithWings
        */
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard Duck ");
    }
}
