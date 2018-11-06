package EdurekaHW.module7;
import java.sql.Connection;
public class StudentBatchProcessing {

    public static void main(String[] args) throws Exception {
        StudentDAO studentDAO = StudentDAOAbstraction.getDBConnection();
        Connection con = ConnectionFactory.getDBConnection();
        con.setAutoCommit(false);

        try {
            studentDAO.deleteStudent(4);

            Student student = new Student(4,"ravi",11,11);
            studentDAO.saveStudent(student);

            Student student1 = new Student(4,"Ravi",11,12);
            studentDAO.updateStudent(student1);

            studentDAO.listStudents();

            studentDAO.searchStudent(12);

            Student student2 = new Student(4,"Ravi",11,12);
            studentDAO.updateStudent(student2);

            Student student3 = new Student(4,"ravi",11,11);
            studentDAO.saveStudent(student3);

            con.commit();

           }catch (Exception e){
            System.out.println("Something Went Wrong, Records has been Rollback");
            con.rollback();
            studentDAO.listStudents();
        }
    }
}

/* OUTPUT of this code
Student ravi register Successfully with ID :4
Student Record Ravi updated Successfully
1|renu|11|11
2|aqws|11|11
3|renu|11|78
4|Ravi|11|12
Student Record Ravi updated Successfully
Something Went Wrong, Records has been Rollback
1|renu|11|11
2|aqws|11|11
3|renu|11|78

Process finished with exit code 0
 */