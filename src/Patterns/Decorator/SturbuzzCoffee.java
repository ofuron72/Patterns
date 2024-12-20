package Patterns.Decorator;

public class SturbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();//Espresso без дополнений

        System.out.println(beverage.getDescription() + " $"+beverage.cost() );

        Beverage beverage2 = new DarkRoast();  //DarkRoast без дополнений
        beverage2 = new Mocha(beverage2);  //добавляем ("заворачиваем в Mocha")
        beverage2 = new Mocha(beverage2);   //добавляем ("заворачиваем в Mocha")
        beverage2 = new Whip(beverage2);   //добавляем ("заворачиваем в Whip")

        System.out.println(beverage2.getDescription() + " $"+beverage2.cost() );//стоимость с учетом добавок

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $"+beverage3.cost() );//стоимость с учетом добавок
        //0.30+0.29+0.2+0.89==1.68




    }
}
