package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinctEx {
    public static void main(String[] args) {
        //Distinct - intermediate method, возврщает stream уникальных элементов
        // Проверку производит с помощью equals, поэтому для объектов его надо переопределять


        Stream<Integer> stream3 = Stream.of(4,5,6,7,8,4,8,10);

        List<Integer> list  =  stream3.distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
