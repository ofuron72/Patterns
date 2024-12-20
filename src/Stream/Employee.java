package Stream;

/*
Comparable используется для сравнения объектов в естественном порядке, например ID
Comparator используется для сравнения объектов, используя не естественный порядок
* */

public class Employee implements Comparable<Employee>{
    @Override
    public int compareTo(Employee o) {
       int res = this.name.compareTo(o.name);
       if (res==0) {
           res = this.surname.compareTo(o.surname);
       }
       return  res;
    }/*
    мы сравниваем текущий объект который мы создадим с объектом в параметре этого метода, и должны вернуть число
    если текущий объект больше объекта в параметре, то вернем положительное
    если текущий объект меньше объекта в парметре, то отрицательное,
    когда равны return 0;
    */

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
