package Collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    /*
    LinkedHashMap содержит информацию о порядке добавления элементов или порядке
    их использовния. Производительность немного ниже, чем у HashMap

    Помимо Элемента, который содержит HashMap, LinkedHashMap содержит ссылку на предыдущий добавленный элемент и последующий

    * */
    public static void main(String[] args) {

        LinkedHashMap<Double,Student> map = new LinkedHashMap<>();

        Student st1 = new Student("Max","Verstappen", 3);
        Student st2 = new Student("Charle","Leclerc", 2);
        Student st3 = new Student("Alex","Albon", 4);
        Student st4 = new Student("Lando","Norris", 3);


        map.put(5.8,st1);
        map.put(8.2,st2);
        map.put(2.6,st4);
        map.put(9.1,st3);
        System.out.println(map);

        LinkedHashMap<Double,Student> map2 = new LinkedHashMap<>(16,0.8f,false);// 3 параметр false
        // запоминает порядок добавления
        //если true, то порядок будет менятся в зависимоссти от того в каком порядке они используются
        // последним будет тот, который последний использовали
        //



    }
}
