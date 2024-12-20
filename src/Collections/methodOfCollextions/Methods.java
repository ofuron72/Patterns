package Collections.methodOfCollextions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(146);
        arrayList.add(232);
        arrayList.add(164);
        arrayList.add(2);
        arrayList.add(4363);
        arrayList.add(356);
        arrayList.add(1234);
        arrayList.add(324);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        int index = Collections.binarySearch(arrayList,1234);
        //если мы хотим применить binary search для объекта, нам нужно прописать
        // условия сравнения либо с помощью comparable, либо comparator
        System.out.println(index);
        Collections.reverse(arrayList);//инвертировать массив,

        System.out.println(arrayList);

        Collections.shuffle(arrayList);//перемешать

        System.out.println(arrayList);
        int[] array = {1,32,34,867,35,74,5};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index2 = Arrays.binarySearch(array,32);
        System.out.println(index2);

    }
}
