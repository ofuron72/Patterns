package Patterns.Decorator;

public class Whip extends Beverage{
     /*
    Класс декоратора расширяет CondimentDecorator,  а CondimentDecorator расширяет Beverage
     */
    //Чтобы в объектк Mocha хранилась ссылка ссылка на Beverage,нам понадобятся:

    Beverage beverage; // 1) Переменная для хранения ссылки

    public Whip(Beverage beverage){  //2) Способ присваивания переменной ссылки на объект
        this.beverage = beverage;      // Мы будем передавать ссылку при вызове конструктора
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    } /*В описании должны содержаться не только названия напитка, но и все дополнения
      (DarkRoast, Mocha, Soy,Whip), таким образом мы сначала получаем описание, делегируя вызов декорируемому объекту,
      а затем присоединяем к нему строку <, Whip>
    */

    public double cost(){
        return 0.29 + beverage.cost();
    }/*
    К стоимости напитка добавляем стоимость добавки
    */
}
