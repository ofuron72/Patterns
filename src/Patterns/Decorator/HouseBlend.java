package Patterns.Decorator;

public class HouseBlend extends Beverage{  //конкретный компонент
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost(){
        return 0.89;
    }

}
