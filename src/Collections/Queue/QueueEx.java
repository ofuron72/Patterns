package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    //если наша очередь ограничена, и мы добавляем через add то при переполнении, будет выбрасываться Exception
    //если через offer, то не выбрасывается, а просто не добавляется
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Max");
        queue.add("Joe");
        queue.add("Jim");
        queue.add("Lewis");
        System.out.println(queue);
        queue.offer("George");
        //remove удаляет первый, add добавляе в конец - LIFO
        //remove выбросит Exception, если элементы закончились
        queue.poll();//удаляет элементы, но в случае если элементы закончились, вернет null
        queue.element();//показывает первый элемент в очереди. Выбросит Exception, если элемента нет
        queue.peek();//показывает первый элемент в очереди. Но не выбросит Exception, а выбросит null

        //но мы можем удалить и из середины очереди, но нет смысла использовать queue
        
    }

}
