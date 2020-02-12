import java.util.ArrayList;

public class Application {

  public static void main(String[] args) {
//    Application类中，有两个学生（Cindy，80），（Mary，95），两个老师（Solider，名下有Mary），（Bob，名下有Cindy）。
//    要求每位老师给每一个学生的成绩加五分，打印出老师和其名下学生的信息。

    Student cindy=new Student("Cindy",80);
    Student mary=new Student("Mary",95);
    ArrayList<Student> studentsOfSolider =new ArrayList();
    studentsOfSolider.add(mary);
    ArrayList<Student> studentsOfBob =new ArrayList();
    studentsOfBob.add(cindy);
    Teacher solider=new Teacher("Solider",studentsOfSolider);
    Teacher bob=new Teacher("Bob",studentsOfBob);

  }

}
