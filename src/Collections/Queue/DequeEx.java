package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    /*
    deque - Двунаправленая очередь (double ended que). В такой очереди элементы могут использоваться с обоих концов
    LIFO и FIFO
    Интерфейс Deque реализуется классами LinkedList и ArrayDeque
    * */
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);

        deque.addLast(2);

        deque.offerFirst(3);

        deque.offerLast(4);//offer не выбрасывает Exception

        deque.removeFirst();//выбрасывает exception

        deque.pollFirst(); //не выбрасывает исключения

        deque.getFirst();

        deque.getLast();

        deque.peekLast();

        deque.peekFirst();//как get, но не выбрасывает Exception
    }
}
