package Patterns.Decorator;

public class Mocha extends CondimentDecorator{
    /*
    Класс декоратора расширяет CondimentDecorator,  а CondimentDecorator расширяет Beverage
     */
    //Чтобы в объектк Mocha хранилась ссылка ссылка на Beverage,нам понадобятся:

    Beverage beverage; // 1) Переменная для хранения ссылки

    public Mocha(Beverage beverage){  //2) Способ присваивания переменной ссылки на объект
        this.beverage = beverage;      // Мы будем передавать ссылку при вызове конструктора
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    } /*В описании должны содержаться не только названия напитка, но и все дополнения
      (DarkRoast, Mocha), таким образом мы сначала получаем описание, делегируя вызов декорируемому объекту,
      а затем присоединяем к нему строку <, Mocha>
    */

    public double cost(){
        return 0.20 + beverage.cost();
    }/*
    Стоимость добавки прибавляется к резльтату
    */
}
