package Collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
     //linked HashSet является наследником HashSet. Хранит информацию о порядке добавления элементов.
    // производительность ниже чем у методов HashSet.
    // В основе LinkedHashSet лежит HashMap.
    //У элементов данного HashMap: Ключи - это элементы LinkedHashSet,
    //значения - constant заглушки
    //! в нем не реализована возмоность хранения в зависимости от последнего использования (т.к. от HashMap, a не от LinkedHashMap)
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(9);
        linkedHashSet.add(3);
        linkedHashSet.add(6);
        System.out.println(linkedHashSet);//соблюдается последовательность элементов



    }
}
