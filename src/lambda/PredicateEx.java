package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {
    // У интерфейса Predicate  единственный метод, который мы должны организовать, boolean test(T t);
    //мы можем создать отдельные экземпляры предикатов (проверки) можно к ним использовать операторы
    // and, or, negate    p1.or(p2), where p1, p2 - predicate

    public static void main(String[] args) {
        Student student1 = new Student("Joe",'m', 85,3,8.9);
        Student student2 = new Student("Max",'m', 24,1,2.5);
        Student student3 = new Student("Maria",'w', 34,2,9.5);
        Student student4 = new Student("Kimi",'m', 19,2,6.3);
        Student student5 = new Student("Jannet",'w', 23,4,9.9);
        Student student6 = new Student("Jim",'m',54,2,6.5);
        Student student7 = new Student("Alex", 'm',32,5,5.5);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);

        System.out.println(list);
        System.out.println("===============");

        Predicate<Student> predicate = student -> student.avgGrade>7;
        list.removeIf( predicate.negate());
        System.out.println(list);

//        PredicateEx predicateEx = new PredicateEx();
//
//        predicateEx.findStudents(list, student -> student.age > 30);
//
//        System.out.println("================================");
//        predicateEx.findStudents(list, student -> student.sex == 'w');
//
//        System.out.println("================================");
//
//        predicateEx.findStudents(list, student -> student.avgGrade <7);
//        System.out.println();


    }

    public void findStudents(ArrayList<Student> students, Predicate<Student> predicate){
        for (Student st: students) {
            if (predicate.test(st)){
                System.out.println(st);
            }
        }
    }
}
