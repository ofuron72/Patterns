package Collections.linkedList;

import java.util.LinkedList;

public class LinkListEx {
    //элементы Linked list хранят данные, а также ссылки на предыдущий и следующие элементы.
    //первый элемент Head, последний tail
    //каждый элемент знает ссылки только на своего соседа, если он не находиться в начале или конце
    //есть двусзвязные и односвзяные

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        linkedList.add(3,7);//первое это индекс, второе значение
        //в случае добавления элементов в середину массива  нам нужо будет только поменять ссылки
        //у его соседей, нам не нужно делать сдвиг всего массива
        linkedList.remove(4);//также меняются только ссылки на соседей, поэтому
        //выигрыш в производительности
        //поиск элемента быстрее в arrayList, удаление и добавление элемента быстрее в linkedList
    }
}
