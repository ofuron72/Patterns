package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        Employee emp1 = new Employee(1,"Jeff","Bessos",1000000);
        Employee emp2 = new Employee(1,"Warrent","Buffet",2000000);
        Employee emp3 = new Employee(1,"Frank","Ebigneil",34000000);
        Employee emp4 = new Employee(1,"Steve","Madden",80000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        List<Employee> richEmployee =  employees.stream().filter(e -> e.salary>1500000)//вместо параметра пишем predicate
                .collect(Collectors.toList());

        //предикат - выражение которое возвращает истину или лож,
        //filter принимает stream, возвращает stream, поэтому преобразовываем

        System.out.println(employees);

        System.out.println(richEmployee);

    }
}
