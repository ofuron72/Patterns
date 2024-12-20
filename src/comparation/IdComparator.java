package comparation;

import java.util.Comparator;

public class IdComparator implements Comparator<EmployeeSecond> {
    /*
    наследуем интерфейс Comparator, имплементируем метод compare, который потом передаем в
    Collections.sort(nameOfCollection, new IdComparator)
    сам метод возвращает положительное число если больше первый объект,
    отрицательное если второе больше,
    0 если равны
    * */

    @Override
    public int compare(EmployeeSecond o1, EmployeeSecond o2) {
        if (o1.id>o2.id){
            return 1;
        }
        else if (o1.id==o2.id){
            return 0;
        }
        return -1;
    }
}
