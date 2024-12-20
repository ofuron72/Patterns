package Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();//создание без capacity
        ArrayList<Integer> list = new ArrayList<>(30);//30 - это capacity

        //не придется постоянно увеличивать массив
        list2.add(1);
        list2.add(4);
        list2.add(3);
        list2.add(9);

        ArrayList<Integer> list3 = new ArrayList<>(list2);// новый объект, ссылаются на разные
        //но элементы одинаковые
        System.out.println(list3);
        //metods
        list3.add(2);//добавление элемента в конец

        list3.add(1, 2); //1 - это эндекс дя добавления 2, остальное сдивгается вправо
        list3.get(1);//по индексу
        list3.set(3, 8);// по индексу 3 заменит элемент на 9  (replace)
        list3.remove(1);//удаление по индексу, все остальные смещаются влево

        // в случае удаления из arrayList некоторго объекта не по индексу, поиск происходит по методы equals,
        //поэтому если он не переопределен, то одинаковые объекты (с одинаковыми полями), не будут удалться,
        // так как имеют разные ссылки

        list2.addAll(list3);//все элементы добавятся в конец list2

        list2.addAll(2, list3);//начиная с определенной позиции

        list2.clear();//очищает arrList

        list2.indexOf(1);//возвращает позицию объекта или -1 если его нет, сравнение происходит по equals

        list2.lastIndexOf(1);// то же самое но поиск с конца

        list2.size();//размер листа

        list2.isEmpty();//проверка пустой он или нет

        list2.contains(1);//содержит ли лист переданный элемент
        // , работает с помощью equals
        list2.toString();


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();

        StringBuilder[] arrSb = {sb1, sb2, sb3, sb4};

        List<StringBuilder> listSB = Arrays.asList(arrSb); //получаем лист из массива, длина не изменяется,
        //если заменяем элемент массива, то это изменение отражается в List

        list2.removeAll(list3);//из List2 удалит все элементы содержащиеся в коллекции list3, которые содержатся в параметре;

        list2.retainAll(list3);// наоборот оставит те параметры, которые есть в коллекции переданной в параметрах;

        list2.containsAll(list3);//проверяет содержатся ли все элементы list3 в list2; возвращает boolean

        list2.subList(1,3); //возвращает лист начиная с (fromIndex, toIndex); toIndex не включительно
        //sublist является лишь представением (view)
        //все структурные модификации (добавление, удаление элементов должны делаться с помощью view),
        //если будем изменять исходный лист, получим ошибку

        Object[] arr = list.toArray();//лист в массив типа object

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Hi");
        arrStr.add("By");
        String[] array2 = list3.toArray(new String[0]);

        //List не изменяем

        List<Integer> list1 = List.of(3,8,13);//сильно перегружен этот метод, изменять его нельзя
        //а также не могут содержать значение null

        List<Integer> list4 = List.copyOf(list2);//также неизменяем, а также не могут содержать значение null





    }
}
