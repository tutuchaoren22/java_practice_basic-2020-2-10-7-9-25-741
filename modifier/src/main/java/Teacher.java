import java.util.ArrayList;

public class Teacher {
    private String name;
    ArrayList<Student> students;

    public Teacher() {
    }

    public Teacher(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
