package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest

    /*
    <?> - любой класс
    <? extends X> - класс X или любой его сабкласс
    <? super Y> - класс Y или любой его супер класс
    * */
{
    List<?> list = new ArrayList<Integer>();//? - wildcard
    //<?> является супертипом для любого листа
    //компилятор не разрешает добавлять в лист ничего

    // bounded wild cards позволяет ограничивать сверху или снизу
    //List<? extends Number> list30 = new ArrayList<Integer>; - корректно
    static void showListInfo(List<?> list){//выводит лист любого типа
        System.out.println("list contained: "+ list);
    }

    //example method of bounded wild card
    public double sum(ArrayList<? extends Number> arrayList){
        double sum = 0;
        for (Number n: arrayList){
            sum+=n.doubleValue();
        }
        return sum; //мы можем передавать сюда ArrayList<Integer> или других типов
    }
}
