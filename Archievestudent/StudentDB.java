package EdurekaHW.module7.student;
import EdurekaHW.module7.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class StudentDB {

    private String DBNAME="Edureka";

    public void CreateTable(String TableName) throws Exception {
            String sql = "CREATE TABLE " +
                    DBNAME+"."+TableName +
                    " (ID INT(10) AUTO_INCREMENT PRIMARY KEY," +
                    "NAME Character(20),CLASS INT(10)," +
                    " MARKS INT(10))";
        Connection con = ConnectionFactory.getDBConnection();
        Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Table "+TableName+" created Successfuly");
        }
    }

    public void newStudent() throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("***** Enter Student Details *****");
            System.out.println("Enter Student Name");
            String studentName = scanner.next();
            System.out.println("Enter Class Standard");
            int classStandard = scanner.nextInt();
            System.out.println("Enter Final Marks");
            int marks = scanner.nextInt();

            Connection con = ConnectionFactory.getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet MaxRollNumber = stmt.executeQuery("select max(ID) from edureka.student");
            int NewRollNumber = 0;
            while(MaxRollNumber.next()) {
                NewRollNumber = MaxRollNumber.getInt(1) + 1;
            }

            String sql = "INSERT INTO Edureka.Student values( " +
                    NewRollNumber +",'"+
                    studentName +"',"+
                    classStandard +","+
                    marks +")";

            stmt.executeUpdate(sql);
            System.out.println("Student " +studentName+" registered with RollNumber "+NewRollNumber+" Successfuly");
        }

    }

    public void deleteStudent() throws Exception{
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("***** Delete Student Details *****");
            System.out.println("Enter Student Roll Number");
            String studentRollNUmber = scanner.next();
            Class.forName(DriverName);
//            System.out.println("DB Connection Started");
            Connection con = DriverManager.getConnection(URL,USER,PASSWD);
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM Edureka.Student " +
                    "where ID ="+studentRollNUmber;
            stmt.execute(sql);
            int n = stmt.getUpdateCount();
            if(n > 0) {
                System.out.println("RollNumber " + studentRollNUmber + " Deleted Successfuly");
                con.commit();
            }
        }catch (Exception e){
            System.out.println("Something Went Wrong, Check Manually");
        }

    }

    public void updateStudentName() throws Exception{{
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("***** Delete Student Details *****");
            System.out.println("Enter Student Roll Number");
            int RollNumber = scanner.nextInt();
            System.out.println("Enter Student Name ");
            String studentName = scanner.next();
            Class.forName(DriverName);
//            System.out.println("DB Connection Started");
            Connection con = DriverManager.getConnection(URL,USER,PASSWD);
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            String sql = "update Edureka.Student " +
                    "set NAME ='"+studentName+"' where ID="+RollNumber;
            stmt.executeUpdate(sql);
            System.out.println("RollNumber " +RollNumber+" Updated Successfuly");
            con.commit();
        }catch (Exception e){
            System.out.println("Something Went Wrong, Check Manually");
        }

    }
    public void displayStudent() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("***** Delete Student Details *****");
            System.out.println("Enter Student Roll Number");
            String studentRollNUmber = scanner.next();
            Class.forName(DriverName);
//            System.out.println("DB Connection Started");
            Connection con = DriverManager.getConnection(URL,USER,PASSWD);
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Edureka.Student " +
                    "where ID ="+studentRollNUmber;
            ResultSet resultSet = stmt.executeQuery(sql);
//            if(resultSet.next()){
            while(resultSet.next()){
                System.out.println("StudentName :"+resultSet.getInt(1));
                System.out.println("StudentName :"+resultSet.getString(2));
                System.out.println("StudentName :"+resultSet.getInt(3));
                System.out.println("StudentName :"+resultSet.getInt(4));
            }
//            }
            con.commit();
        }catch (Exception e){
            System.out.println("Something Went Wrong, Check Manually");
        }
    }
}


