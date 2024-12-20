package Collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    /*
    TreeSet хранит элементы в отсортированном по возрастанию порядке
    В основе лежит TreeMap
    У элементов данного TreeMap: ключи - это элементы TreeSet, Значения - это константа-заглушка

    TreeSet, как и TreeMap не может хранить Null

    * */
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(4);

        treeSet.remove(3);

        treeSet.contains(7);



        System.out.println(treeSet);

        // если используется какой-то класс, должен быть Comparable или Comparator
        TreeSet<Student> treeSet2= new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Student st1 = new Student("Max","Verstappen", 3);
        Student st2 = new Student("Charle","Leclerc", 2);
        Student st3 = new Student("Alex","Albon", 4);
        Student st4 = new Student("Lewis","Hamilton",1);
        treeSet2.add(st1);
        treeSet2.add(st2);
        treeSet2.add(st3);
        treeSet2.add(st4);
        System.out.println(treeSet2);

        System.out.println(treeSet2.last());
        System.out.println(treeSet2.first());
        System.out.println(treeSet2.headSet(st2));//раньше чем St2
        System.out.println(treeSet2.tailSet(st2));//позже чем St2

        System.out.println(treeSet2.subSet(st3,st1)+" subset");// [   ;   ) первый включительный, второй нет

        //если мы делаем override equals, то a.compareTo(b) должен возращать 0,  P.S. под вопросом?



    }
}
