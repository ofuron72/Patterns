package lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Joe",'m', 85,3,8.9);
        Student student2 = new Student("Max",'m', 24,1,2.5);
        Student student3 = new Student("Margarett",'w', 34,2,9.5);
        Student student4 = new Student("Kimi",'m', 19,2,6.3);
        Student student5 = new Student("Jannet",'w', 23,4,9.9);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo studentInfo = new StudentInfo();

        studentInfo.testStudents(students, new checkOverGrade());//нехороший подход так как вручную пишем

        studentInfo.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age<30;
            }
        });

        studentInfo.testStudents(students, (Student student) -> {return student.age>30;});



        }
    void testStudents(ArrayList<Student> list, StudentChecks sc){
        for (Student s: list){
            if (sc.check(s)){
                System.out.println(s);
            }
        }

    }
}
