package Generics;

import java.util.ArrayList;
import java.util.List;
/*
    преимущества generic:
        - type safe
        - reusable code (позволяют не содавать лишний код)

        в <  > указываются обёртки классов (wrapped)
        для jvm не существует информации о generics
     */

public class Test1 {

    List list = new ArrayList();//если без generic, то это list object'ов
    //так писать нельзя (raw type) - сырой тип
    Object o = new Object();
    List<String> list2 = new ArrayList<>();

    //public static <T extends Number> T get SecondElement(ArrayList<T> list)
    //public static <T extends Number&I1&I2> T get SecondElement(ArrayList<T> list)   интерфейсы I1 I2 тоже в extend
    //class всегда на первом месте

}
