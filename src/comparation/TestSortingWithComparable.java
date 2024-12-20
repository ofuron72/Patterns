package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSortingWithComparable {
    public static void main(String[] args) {
        Employee employee1 = new Employee(3, "Denis", "Surname", 10000);
        Employee employee2 = new Employee(1, "Ivan", "Jobs", 3000);
        Employee employee3 = new Employee(2, "Alex", "Gates", 40000);
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
