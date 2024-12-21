package Stream;

import java.util.stream.Stream;

public class StreamPeekEx {
    public static void main(String[] args) {
        /*peek() - intermediate, как и метод foreach() принимает в параметры Consumer
        но возвращает stream
        Поэтому может быть использован для того чтобы посмотреть как проходит chaining
         */

        Stream<Integer> stream1 = Stream.of(1,2,3,3,4,5,6,7,8,9);
        System.out.println(stream1.distinct()
                .peek(elem-> System.out.println(elem))
                .count()
        );
    }
}
