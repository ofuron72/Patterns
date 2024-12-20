package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMapEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dollar");
        list.add("Euro");
        list.add("Yen");
        list.add("Sterling");
        list.add("Yuan");

        System.out.println(list);

        //получаем лист длин строк

//        for (int i =0; i< list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        } Реализация без stream

        //Эти методы будут работать не напрямую с массивами или коллекциями,
        //а преобразуют их в потоки

        //на выходе тоже имеем stream, мы не можем присвоить значение list2
        //а преобразуем поток в лист с помощью collect
         List<Integer> list2 = list.stream().map(element -> element.length())
                 .collect(Collectors.toList());
        //метод map берет по очереди каждый элемент из
        // нашего стрима и сопоставляет ему элемент
        //который мы получаем после тех действий, которые описываем внутри map  с помощью лямбда выражений

        System.out.println(list2);

        int[] array = {3,5,9,5,2};
        int[] array2 = Arrays.stream(array).map(element -> element*2)
                .toArray();//массив - в поток - в массив

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(array2));

        Set<String> set = new TreeSet<>();

        set.add("Dollar");
        set.add("Euro");
        set.add("Yen");
        set.add("Sterling");
        set.add("Yuan");

        System.out.println(set);

        //
        Set<Integer> set2 =  set.stream().map(element -> element.length())
                .collect(Collectors.toSet());

        System.out.println(set2); //убрал дубликаты по длине и отсортировал из-за особенностей set

    }
}
