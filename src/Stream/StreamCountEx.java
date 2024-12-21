package Stream;

import java.util.stream.Stream;

public class StreamCountEx {
    public static void main(String[] args) {
        //Count() - terminal method,считает количество элементов в stream и возвращает Long

        //stream после обработки нельзя переиспользовать
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,5,5,7,8);

        long res = stream2.distinct().count();

        System.out.println(res);

    }
}
