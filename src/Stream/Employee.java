package Stream;

/*
Comparable используется для сравнения объектов в естественном порядке, например ID
Comparator используется для сравнения объектов, используя не естественный порядок
* */

public class Employee implements Comparable<Employee>{
    @Override
    public int compareTo(Employee o) {

       return  o.salary-this.salary;
    }/*
    мы сравниваем текущий объект который мы создадим с объектом в параметре этого метода, и должны вернуть число
    если текущий объект больше объекта в параметре, то вернем положительное
    если текущий объект меньше объекта в парметре, то отрицательное,
    когда равны return 0;
    */

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

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
