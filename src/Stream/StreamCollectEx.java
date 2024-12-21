package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectEx {
    public static void main(String[] args) {
        //collect()- terminal method
        /*
        Мы использовали его чтобы поток преобразовать в list или set или другую коллекцию
        Когда мы его использовали, мы использовали Collectors, у которого есть 2 метода
        1) groupingBy -
        2) partitioningBy
         */
        List<Employee> employees= new ArrayList<>();
        Employee emp1 = new Employee(3,"Jeff","Bessos",1000000);
        Employee emp2 = new Employee(2,"Warrent","Buffet",2000000);
        Employee emp3 = new Employee(1,"Frank","Ebigneil",34000000);
        Employee emp4 = new Employee(2,"Steve","Madden",80000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        Map<Integer,List<Employee>> map  = employees.stream()
                .map(elem-> {
            elem.setName(elem.getName().toUpperCase());
            return elem;
        })
                .collect(Collectors.groupingBy(el->el.getId()));//collect вернет Map
        //пара ключ-значение <Integer,List<Employee>>
        // ,который содержит integer, как ключ; как значение - лист студентов

        System.out.println(map);

        for(Map.Entry<Integer,List<Employee>> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        Map<Boolean,List<Employee>> dividedEmps = employees.stream().collect(Collectors.
                partitioningBy(e->e.getSalary()>1500000));//в данном случае ключём будет boolean
        //Map<Boolean,List<Employees>> //разделяет пополам: true и false


        System.out.println("==============================");

        for(Map.Entry<Boolean,List<Employee>> entry: dividedEmps.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }
}
