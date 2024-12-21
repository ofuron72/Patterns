package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduceEx {
    public static void main(String[] args) {
        //при применении reduce на выходе всегда получаем один элемент
        //reduce() - terminal method
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(4);
        list.add(2);
        list.add(5);

        int res1  = list.stream().reduce((accumulator,element)->
                accumulator+element).get();
        //list = 3, 6, 8, 4, 2, 5
        //accumulator - в нем накапливается сумма
        //метод reduce возвращает Optional - поэтому нужен get()
        //объект типа Optional оборачивает значение, может содержать null и not null
        //проверяется на null с помощью isPresent
        System.out.println(res1);//сумма 28

        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> o = list2.stream().reduce((accumulator, element)->
                accumulator+element); // вернет null

        if (o.isPresent()){
            System.out.println(o.get());//извлечь из optional
        }
        else {
            System.out.println("not present");
        }

        int res2  = list.stream().reduce(8, (accumulator,element)->
                accumulator+element);//так мы задали 8, это изначальное значение,
        System.out.println(res2);

        List<String> list3 = new ArrayList<>();
        list3.add("Dollar");
        list3.add("Euro");
        list3.add("Yen");
        list3.add("Sterling");
        list3.add("Yuan");
        String res3 = list3.stream().reduce((accumulator, elem)-> accumulator+" "+elem).get();
        System.out.println(res3);


    }
}
