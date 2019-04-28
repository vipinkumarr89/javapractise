package EdurekaHW.module7;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) throws Exception {

        StudentDAO studentDAO = StudentDAOAbstraction.getDBConnection();


        System.out.println("Enter Student Roll number");
        Scanner scanner = new Scanner(System.in);
        int ID = scanner.nextInt();
        studentDAO.deleteStudent(ID);
        System.out.println("======================================================");

        Student student = new Student(1, "arun", 11, 12);
        studentDAO.saveStudent(student);
        System.out.println("======================================================");

        System.out.println("Enter Student Roll number");
        Scanner scanner1 = new Scanner(System.in);
        int ID1 = scanner1.nextInt();
        studentDAO.searchStudent(ID1);
        System.out.println("======================================================");

        Student student1 = new Student(1, "Varun", 11, 12);
        studentDAO.updateStudent(student1);
        System.out.println("======================================================");



        studentDAO.listStudents();
        System.out.println("====================================");
    }
}
