package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestWithComparator {
    public static void main(String[] args) {
        EmployeeSecond employeeSecond1 = new EmployeeSecond(5,"Joe","Green",8000);
        EmployeeSecond employeeSecond2 = new EmployeeSecond(5,"Jim","Gray",3000);
        EmployeeSecond employeeSecond3 = new EmployeeSecond(5,"Jack","Black",6000);
        EmployeeSecond employeeSecond4 = new EmployeeSecond(5,"Richard","Red",7000);
        List<EmployeeSecond> emps = new ArrayList<>();
        emps.add(employeeSecond1);
        emps.add(employeeSecond2);
        emps.add(employeeSecond3);
        emps.add(employeeSecond4);
        System.out.println(emps);
        Collections.sort(emps, new IdComparator());
        System.out.println(emps);
        Collections.sort(emps, new SalaryComparator());
        System.out.println(emps);
        /*
        Если имплементируется comparable, который сортирует по ID,
        Но нам необходима другая сортировка, то мы можем передать в параметры второй параметр
        класс, который имплементирует comparator, в таком случае comparator будет приоритетней comparable
         */
    }
}
