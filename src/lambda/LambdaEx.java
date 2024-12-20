package lambda;

public class LambdaEx {
    //Самый короткий вариант написания лямбда stud -> stud.avgGrade > 8.5
    //Более полный вариант написания лямбда выражения (Student stud) -> {return stud.avgGrade > 8.5;}
    public static void main(String[] args) {
        Student student1 = new Student("Joe",'m', 85,3,8.9);
        Student student2 = new Student("Max",'m', 24,1,2.5);
        Student student3 = new Student("Margarett",'w', 34,2,9.5);
        Student student4 = new Student("Kimi",'m', 19,2,6.3);
        Student student5 = new Student("Jannet",'w', 23,4,9.9);
        Student student6 = new Student("Jim",'m',54,2,6.5);
        Student student7 = new Student("Alex", 'm',32,5,5.5);

    }
}
