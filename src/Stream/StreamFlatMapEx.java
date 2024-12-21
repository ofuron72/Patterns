package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMapEx {
    public static void main(String[] args) {
        /*
        FlatMap() - intermediate method
        Метод FlatMap() мы используем когда нам нужно поработать не с самими элементами коллекции
        , а с элементами элементов нашей коллекции (зайти в глубь)

         */
        List<Employee> employees= new ArrayList<>();
        Employee emp1 = new Employee(1,"Jeff","Bessos",1000000);
        Employee emp2 = new Employee(2,"Warrent","Buffet",2000000);
        Employee emp3 = new Employee(4,"Frank","Ebigneil",34000000);
        Employee emp4 = new Employee(3,"Steve","Madden",80000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        Forbes forbes = new Forbes("Rich men");
        Forbes forbes1 = new Forbes("Poor men");
        forbes.addEmployeeToList(emp1);
        forbes.addEmployeeToList(emp2);
        forbes.addEmployeeToList(emp3);

        forbes1.addEmployeeToList(emp4);

        List<Forbes> forbesList = new ArrayList<>();
        forbesList.add(forbes);
        forbesList.add(forbes1);

        /*
         С помощью метода FlatMap() и вызова метода stream() на каждом элементе
        листа списков forbes, мы для каждого элемента коллекции forbesList,
        создаем свой stream, получается stream stream`ов
         */

        forbesList.stream().flatMap(forb->forb.getEmps().stream())//достаем список работников
                .filter(e->e.salary!=2000000)//убираем одного из работников
                .forEach(em-> System.out.println(em));
    }
}
