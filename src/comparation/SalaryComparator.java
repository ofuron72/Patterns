package comparation;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeSecond> {
    @Override
    public int compare(EmployeeSecond o1, EmployeeSecond o2) {
        if (o1.salary>o2.salary){
            return 1;
        }
        else if (o1.salary<o2.salary){
            return -1;
        }
        return 0;
    }
}
