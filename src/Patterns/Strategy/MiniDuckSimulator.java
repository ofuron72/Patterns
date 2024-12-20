package Patterns.Strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuake();//Вызов метода performQuack(), унаследованного классом MallardDuck;
                                //Метод делегирует выполнение операции по ссылке на QuackBehavior
                                // (то есть вызывает quack() через унаследованную переменную QuackBehavior)
        mallard.performFly();// то же самое происходит с методом performFly(), а также унаследованным классом MallardDuck

        Duck modelDuck = new ModelDuck();

        modelDuck.performFly(); // не летает т.к. реализация передается FlyNoWay

        modelDuck.setFlyBehavior(new FlyRocketPowered());

        modelDuck.performFly();  //Полетела как ракета т.к. реализация передалась FlyRocketPowered
        //благодаря setBehavior методу

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuake();
    }
}
