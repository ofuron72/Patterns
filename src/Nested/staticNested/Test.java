package Nested.staticNested;

public class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);//так как он nested static
        //создается так и только так, можети быть использован другими классами
        /*
        static nested может обращаться даже к private элементам внешнего класса, но только static
        static nested может содержать static и non-static элементы
        Внешний класс может обращаться даже к private элементам nested класса

        //внешними и внутрениими могут быть не только классы но и Интерфейсы
         */

        System.out.println(e);

        Car car = new Car("Black", 2, e);
        System.out.println(car);

    }
}
