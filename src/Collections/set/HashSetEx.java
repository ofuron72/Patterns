package Collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    /*
    Set - множество, набор уникальных элементов, методы данной коллекции очень быстры
    Set, урезанный Map, в основе Set лежит map который хранит не пару ключ-значение,
    а ключ это элемент HashMap, вместо значения заглушка - константа
    - Map <Key, Value>
    - Set <Key, "заглушка"> -Map с заглушкой (constant)
    HashSet не запоминает порядок добавления элементов
    HashSet может содержать значение null
    Также важно переопределять методы Equals и HashCode
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Joe");
        set.add("Max");
        set.add("Lando");
        set.add("Alex");
        set.add("Oscar");
        set.add("Michael");

        System.out.println(set);

        for (String s : set){
            System.out.println(s);
        }

        set.remove("Joe");

        System.out.println(set.size());

        System.out.println(set.isEmpty());

        System.out.println(set.contains("Max"));

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // из теории множеств

        HashSet<Integer> unionSet = new HashSet<>(set1);

        unionSet.addAll(set2); //объединение

        System.out.println(unionSet);

        HashSet<Integer> intersectSet = new HashSet<>(set1);

        intersectSet.retainAll(set2);//пересечение

        System.out.println(intersectSet);

        HashSet<Integer> subtractSet = new HashSet<>(set1);

        subtractSet.removeAll(set2);//Разность

        System.out.println(subtractSet);




    }
}
