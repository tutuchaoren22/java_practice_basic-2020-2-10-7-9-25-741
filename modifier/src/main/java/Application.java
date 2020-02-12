import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Student cindy = new Student("Cindy", 80);
        Student mary = new Student("Mary", 95);

        ArrayList<Student> studentsOfSolider = new ArrayList();
        studentsOfSolider.add(mary);
        Teacher solider = new Teacher("Solider", studentsOfSolider);

        ArrayList<Student> studentsOfBob = new ArrayList();
        studentsOfBob.add(cindy);
        Teacher bob = new Teacher("Bob", studentsOfBob);

        for (Student student : solider.getStudents()) {
            solider.setStudentsScore(student, student.getScore() + 5);
        }

        for (Student student : bob.getStudents()) {
            bob.setStudentsScore(student, student.getScore() + 5);
        }

        solider.printTeacherInfo();
        bob.printTeacherInfo();
    }

}
