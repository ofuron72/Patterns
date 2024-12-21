package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedEx {
    public static void main(String[] args) {
        //sorted - intermediate method
        int[] array = {2,8,4,6,5,9,1};
        System.out.println(Arrays.toString(array));
        //sorted
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        List<Employee> employees= new ArrayList<>();
        Employee emp1 = new Employee(8,"Jeff","Bessos",1000000);
        Employee emp2 = new Employee(6,"Warrent","Buffet",2000000);
        Employee emp3 = new Employee(3,"Frank","Ebigneil",34000000);
        Employee emp4 = new Employee(5,"Steve","Madden",80000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);



        //для того чтобы сортировать объекты с помощью sorted,
        // должны быть  comparable или comparator
        System.out.println(employees);
        employees = employees.stream().sorted().collect(Collectors.toList()); // работает потому что comparable есть

        System.out.println(employees);

        employees = employees.stream().sorted((x,y)->x.id-y.id).collect(Collectors.toList());
        System.out.println(employees);//comparator
    }
}
