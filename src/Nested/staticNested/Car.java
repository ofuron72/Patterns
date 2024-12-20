package Nested.staticNested;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
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
