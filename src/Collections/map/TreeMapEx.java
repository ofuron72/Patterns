package Collections.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    /*
    Элементами TreeMap являются пары ключ/значение

    В TreeMap элементы хранятся в отсортированном по возрастанию порядке (по ключу)
    В основе treeMap лежит красно-черное дерево, методы работают быстро, но не быстрее чем HashMap

    Если добавить по ключу который уже есть в таблице, то  элемент перезапишется
     */

    /*
    Если в качестве ключа будет Student, то нужна реализовать интрфейс comparable, чтобы сортировать
    * */

    /*
    При работе с treeMap нет необходимости переопределять HashCode и Equals потому что здесь вcе поиски,
    добавления и т.д. идут с помощью compareTo метода
    , но это не относится к Values
    Но все же лучше переопределять

    Red-Black tree один из видов самобалансирующихся двоичнх деревьев
    т.е. когда все идёт в одну сторону в двоичном дереве, происходит перегруппировка

    TreeMap not synchronized
     */
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Max","Verstappen", 3);
        Student st2 = new Student("Charle","Leclerc", 2);
        Student st3 = new Student("Alex","Albon", 4);
        Student st4 = new Student("Lando","Norris", 3);
        Student st5 = new Student("Oscar","Piastry", 2);
        Student st6 = new Student("Lewis","Hamilton", 4);
        Student st7 = new Student("George","Rassel", 4);

        treeMap.put(5.8,st1);
        treeMap.put(8.5,st5);
        treeMap.put(8.2,st2);
        treeMap.put(6.2,st6);
        treeMap.put(9.1,st3);
        treeMap.put(2.6,st4);
        treeMap.put(7.6,st7);

        System.out.println(treeMap);

        System.out.println(treeMap.get(7.6));

        treeMap.remove(2.6);

        System.out.println(treeMap);

        System.out.println("=========================================================");

        System.out.println(treeMap.descendingMap());//выведет в обратном порядке

        System.out.println(treeMap.tailMap(7.3));// всех студентов от 7.3 баллов
        System.out.println(treeMap.headMap(7.3));//всех студентов до 7.3 баллов
        System.out.println(treeMap.lastEntry());//элемент в самом конце
        System.out.println(treeMap.firstEntry());//в начале


        //если сам класс не реализует comparable, то в параметре можем реализовывать comparator

        TreeMap<Student,Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.name.compareTo(o2.name);
            }
        });





    }
}
