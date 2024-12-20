package Patterns.Decorator;

public class Espresso extends Beverage{  //конкретный компонент
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
    /*
    Остается вычислить стоимость напитка. В этом классе беспокоится о дополнениях не нужно,
    поэтому мы просто возвращаем стоимость "базового" эспрессо: $1.99

    */
}
