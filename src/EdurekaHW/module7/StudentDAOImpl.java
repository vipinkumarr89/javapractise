package EdurekaHW.module7;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class StudentDAOImpl implements StudentDAO{
    private static Connection con;
    private static Statement stmt;

    public StudentDAOImpl() throws Exception {
        con = ConnectionFactory.getDBConnection();
        stmt = con.createStatement();
    }

    @Override
    public void saveStudent(Student stud) throws Exception {

//        System.out.println("Enter Student Details");
//        System.out.println("Enter Student Name");
//        Scanner scanner = new Scanner(System.in);
//        stud.setStudentName(scanner.next());
//        System.out.println("Enter Student Class");
//        stud.setStudentClass(scanner.nextInt());
//        System.out.println("Enter Student Marks");
//        stud.setStudentMarks(scanner.nextInt());
//        ResultSet MaxRollNumber = stmt.executeQuery("select max(ID) from edureka.student");
//        int NewRollNumber = 0;
//        while(MaxRollNumber.next()) {
//            NewRollNumber = MaxRollNumber.getInt(1) + 1;
//        }
//        stud.setStudentID(NewRollNumber);
        String sql = "insert into Student Values ("
                +stud.getStudentID()+",'"
                +stud.getStudentName()+"',"
                +stud.getStudentClass()+","
                +stud.getStudentMarks()+")";

        int sqloutput = stmt.executeUpdate(sql);
        if (sqloutput > 0){
            System.out.println("Student "
                    +stud.getStudentName()
                    +" register Successfully with ID :"
                    + stud.getStudentID());
        }
    }

    @Override
    public void deleteStudent(int ID) throws Exception {
//        System.out.println("Enter Student Roll Number");
//        Scanner scanner = new Scanner(System.in);
//        stud.setStudentID(scanner.nextInt());
        String sql = "Delete from edureka.Student where ID ="+ID ;

        int sqloutput = stmt.executeUpdate(sql);
        if(sqloutput > 0){
            System.out.println("Student Roll Number "
                    +ID
                    +" has been deleted Successfully");
        }
    }

//    @Override
    public void updateStudent(Student stud) throws Exception {
        String sql = "update edureka.Student set  "
                + "NAME='" +stud.getStudentName()+"'," +
                "CLASS=" +stud.getStudentClass()+"," +
                "MARKS=" +stud.getStudentMarks() +
                " where ID=" +stud.getStudentID();

        int sqloutput = stmt.executeUpdate(sql);
        if (sqloutput > 0) {
            System.out.println("Student Record "
                    + stud.getStudentName()
                    + " updated Successfully");
        }
    }

    @Override
    public void searchStudent(int ID) throws Exception {
            String sql = "select * from edureka.Student where ID="
                    +ID;
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()){
            System.out.println("Student ID "+resultSet.getInt(1));
            System.out.println("Student Name "+resultSet.getString(2));
            System.out.println("Student Class "+resultSet.getString(3));
            System.out.println("Student Marks "+resultSet.getInt(4));
        }
    }

    @Override
    public void listStudents() throws Exception {
        String sql = "Select * from Student";
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)
                   +"|"+resultSet.getString(2)
                   +"|"+resultSet.getInt(3)
                   +"|"+resultSet.getInt(4));
        }

    }
}
