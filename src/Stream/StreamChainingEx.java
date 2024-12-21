package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamChainingEx {
    public static void main(String[] args) {

        /*
        Как работает chaining в stream:
        Source (Коллекции, массивы) ->
        создается stream и используем его элементы в наших методах, которые называются

        intermediate (промежуточные) (lazy) - промежуточные методы обрабатывают и возвращают stream
        (пришел Stream - ушел Stream) - их может быть много (map,filter,sorted...), !но они не будут исполнены,
        пока не будет вызван terminal method

        и потом поток поступает к terminal method (eager-нетерпеливый), (конечные методы), пример:
        forEach(), reduce()
        Терминальный метод стоит в конце и после него  терминальный метод уже нельзя вызвать
        так как оин возвращают не поток,
        после них на chaining заканчивется, методы срабатывают сразу после вызова
         */

        /*
        lazy обычно называются оперции, которые не сработают пока что-то не сработает
         */
        int[] array = {2,8,4,6,5,9,1};

        Integer result = Arrays.stream(array)
                .filter(e->e%2==0) //2,8,4,6  intermediate method
                .map(e->e*2) //4,16,8,12   intermediate method
                .reduce(1,(ac,ec)->ac+ec); //1+4+16+8+12 = 41 terminal method*
        System.out.println(result);

        //Пример, показывающий, что если нет terminate method, ни один intermediate method не будет обработан
        Stream<Integer> stream = Stream.of(1,35,2,3,6,8,4,3);
        stream.filter(e-> {
            System.out.println("Check"); //не будет выведено так как filter это lazy method
            return e>3;
        });

        Stream<Integer> stream2 = Stream.of(1,35,2,3,6,8,4,3);
        List<Integer> result2 = stream2.filter(e-> {
            System.out.println("Check"); //не будет выведено так как filter это lazy method
            return e>3;
        })
                .collect(Collectors.toList()); //благодаря terminate method collect отработают и lazy

        System.out.println(result2);


    }
}
