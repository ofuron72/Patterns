package lambda;

public class checkOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}
