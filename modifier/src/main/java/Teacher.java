import java.util.ArrayList;

public class Teacher {
    private final String name;
    private ArrayList<Student> students;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setStudentsScore(Student student, int score) {
        if (this.students.contains(student)) {
            student.setScore(score);
        } else {
            System.out.println("He/She is not my student!");
        }
    }

    public void printTeacherInfo() {
        System.out.println("I am a teacher." + "My name is " + this.name + ".");
        System.out.println("I teach these students:");
        for (Student student : this.students) {
            System.out.println("I am a student of " + this.name + ",My name is " + student.getName() + ".My score is " + student.getScore() + ".");
        }
    }
}
