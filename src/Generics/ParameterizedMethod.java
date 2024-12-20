package Generics;

import java.util.ArrayList;

public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        int a = GenMethod.getSecondElem(list);
        System.out.println(a);

        ArrayList<String> listString = new ArrayList<>();

        listString.add("Hi");
        listString.add("By");
        listString.add("Yu");

        String str = GenMethod.getSecondElem(listString);
        System.out.println(str);

    }
}
