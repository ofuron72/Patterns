package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamForEachEx {
    public static void main(String[] args) {
        //forEach не возвращает ничего, поэтому нельзя превратить во что-нибудь

        int[] array = {3,9,6,8,4};

        Arrays.stream(array).forEach(e -> System.out.println(e*2));//с каждым элементом делается то что написано

        Arrays.stream(array).forEach(System.out::println);//аналог записи, method reference

        List<Employee> employees= new ArrayList<>();
        Employee emp1 = new Employee(1,"Jeff","Bessos",1000000);
        Employee emp2 = new Employee(1,"Warrent","Buffet",2000000);
        Employee emp3 = new Employee(1,"Frank","Ebigneil",34000000);
        Employee emp4 = new Employee(1,"Steve","Madden",80000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        Stream<Employee> stream = Stream.of(emp1,emp2,emp3,emp4); //еще один вариант создания stream (редко)


    }
}
