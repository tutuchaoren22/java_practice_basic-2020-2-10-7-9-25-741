import java.util.ArrayList;

//Teacher有姓名和学生两个属性，姓名属性不能更改。
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
