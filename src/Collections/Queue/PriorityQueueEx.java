package Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    //специальный вид очереди в котором идет натуральная сортировка или та, которую мы описываем с помощью
    //Comparable или Comparator, Таким образом используется тот элемент приоритет которого выше
    //сортировка на натуральной основе это по возрастанию, наивысший приоритет у наименьшего
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);

        PriorityQueue<Student> priorityQueue1 = new PriorityQueue<>(new Comparator<Student>() {//собственная сортировка
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(priorityQueue.peek());//первый элемент


    }
}
