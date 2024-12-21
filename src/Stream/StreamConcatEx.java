package Stream;

import java.util.stream.Stream;

public class StreamConcatEx {
    public static void main(String[] args) {
        //метод concat статический и возвращает stream, но он не может быть использован в цепочке

        Stream<Integer> stream1 = Stream.of(1,35,2,3,6,8,4,3);

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);

        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);

        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        stream4.forEach(e->{
            System.out.println(e);
        });
    }
}
