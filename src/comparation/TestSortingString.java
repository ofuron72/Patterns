package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSortingString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Denis");
        list.add("Maks");
        list.add("Ivan");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
