package Patterns.Strategy;

public abstract class Duck {
    /*
    Поведение не наследуется, а предоставляется парвильно выбранным объектам  - механизм композиция
    Системы созданные на основе композиции обладают большей гибкостью
     */

    FlyBehavior flyBehavior;      //Объявляем две ссылочные переменные с типами интерфейсов поведения.
    QuackBehavior quackBehavior;  //Переменные наследуются всеми subclass duck (в том же пакете)

    public Duck() {
    }

    public abstract void display();

    public void performFly(){ //Каждый объект Duck делегирует поведение объекту на который ссылается FlyBehaviour
        flyBehavior.fly();

    }

    public void performQuake(){ //Каждый объект Duck делегирует поведение объекту на который ссылается QuackBehaviour
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!"); //decoy - приманка, дефолтная реализация для всех
    }

    /*
    dynamic behavior change
    Это можно делать с помощью сеттера
     */

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
