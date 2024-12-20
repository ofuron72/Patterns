package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PrimitiveIterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        Iterator<Integer> iterator = arrayList.iterator(); //добавляем итератор к ArrayList;
        //c помошью итератора мы можем удалить элелемент коллекции
        Iterator<Integer> iteratorExample = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return 0;
            }
        };


        System.out.println(arrayList);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




        Iterator<Integer> iterator2 = arrayList.iterator();
        while (iterator2.hasNext()){

            if (iterator2.next()==5){
                iterator2.remove();   //c помошью итератора мы можем удалить элелемент коллекции
            }
        }
        System.out.println(arrayList);
    }
}
