package Collections.map;

import java.util.HashMap;
import java.util.Map;

public class HasCodeEx1 {
    public static void main(String[] args) {

        Map<Student,Double> map = new HashMap<>();

        Student st1 = new Student("Max","Verstappen", 3);
        Student st2 = new Student("Charle","Leclerc", 2);
        Student st3 = new Student("Alex","Albon", 4);

        map.put(st1,8.2);
        map.put(st2,7.4);
        map.put(st3,6.1);

        System.out.println(map);

        Student st4 = new Student("Max","Verstappen",3);

        boolean result = map.containsKey(st4);
        System.out.println(result);//несмотря на то что реализован метод equals,
                                  /* будет выведен false
                                  так как map использует хэширование при поиске и сравнении
                                  поэтому даже если equals переопределен и возвращает true,
                                  наше сравнение будет неудачным если не переопределён hashcode
                                  В Java хэширование это преоразование с помощью метода hashcode
                                  любого объекта в int
                                  * */
        System.out.println(st1.equals(st4));//true так как переопределили equals

        //на данном этапе мы переопределили hashcode

        result = map.containsKey(st4);
        System.out.println(result);
        //но если у нас НЕ переопределен equals, но переопределен hashcode, то у нас будет false
        //сравнение в hashmap сначала идет по hashcode, потом по equals, т.е. оба методы должны быть правильно переопределены
        // у стандартных типов hashcode переопределен, в иных мы должны переопределять сами
        //переопределять hashcode мы можем и по своим правилам
        //ситуация когда у разных объектов возвращается одинаковый hashcode, называется КОЛЛИЗИЕЙ
        //1) Результат нескольких выполений методы hashcode для одного и того же объекта должен быть одинаковым
        //2) Если согласно методу equals, два объекта равны, то и hashcode данных объектов должен быть одинаковым
        //3) Если согласно методу equals два объекта НЕ равны, то hashcode данных объектов НЕ ОБЯЗАТЕЛЬНО должен быть разным
        //hashcode работает быстрее чем equals
        // количество возможных hashcode ограничено int? поэтому для бесконченого множества объектов будет встречаться КОЛЛИЗИЯ
        // в DEFAULT реализации hashcode в алгоритме используется адрес объекта, поэтому даже при одинаковых equals,
        // hashcode будут различаться


    }
}
