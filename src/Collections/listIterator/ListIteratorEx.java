package Collections.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    //listIterator расширяет возможности простого итератора
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(34);
        list.add(23);
        list.add(10);
        list.add(15);
        list.add(34);

        ListIterator<Integer> iterator = new ListIterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return 0;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Integer previous() {
                return 0;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Integer integer) {

            }

            @Override
            public void add(Integer integer) {

            }
        };

    }
}
