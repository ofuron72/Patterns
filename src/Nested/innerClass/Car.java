package Nested.innerClass;

import java.util.Arrays;

//Inner class может содержать только non-static элементы
//внешний класс может обращаться к полям inner класса, предварительно создав его объект
public class Car {

    String color;
    int doorCount;
    Engine engine;
    //можно еще сделать метод setEngine
    /*
    тогда при создании класса
    будет создаваться так
    Car.Engine engine = car.new Engine(150);
    car.setEngine(engine);

    Car.Engine engine3 = new Car("black",4).newEngine(200);  - Ещё один вариант
     */

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);//создание класса в конструкторе  (inner класса)
        //так как он завязан на внешнем классе
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public  class Engine{
        int HorsePower;

        public Engine(int horsePower) {

            HorsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine: {" +
                    "HorsePower=" + HorsePower +
                    '}';
        }
    }
}
