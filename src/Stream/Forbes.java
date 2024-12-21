package Stream;

import java.util.ArrayList;
import java.util.List;

public class Forbes {
    String name;
    List<Employee> emps;

    public Forbes(String name) {
        this.name = name;
        emps = new ArrayList<>();
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void addEmployeeToList(Employee employee){
        this.emps.add(employee);
    }
}
