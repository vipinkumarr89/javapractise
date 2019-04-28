package EdurekaHW.module7;

import java.sql.*;
import java.util.Scanner;
public class Module7StudentDB {
        public static void main(String[] args) {
            try {
                // Driver loading
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("DB Connection Started");
                //Creating Connection with DB
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/edureka", "root", "");
               con.setAutoCommit(false);
                // Testing Connection
                Statement stmt = con.createStatement();
                try {
                    //User Input
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter student ID:");
                    int ID = scanner.nextInt();
                    System.out.println("Enter Student Name:");
                    String name = scanner.next();
                    System.out.println("Enter Student class:");
                    int classNumber =scanner.nextInt();
                    System.out.println("Enter Student Marks");
                    int marks = scanner.nextInt();

                    CallableStatement calstat = con.prepareCall("{CALL INSERTINTOSTUDENT(?,?,?,?)}");
                    calstat.setInt(1,ID);
                    calstat.setString(2,name);
                    calstat.setInt(3,classNumber);
                    calstat.setInt(4,marks);
                    calstat.execute();
                    con.commit();
                    System.out.println("Student record saved in DB Successfully");
                } catch (Exception e){
                    con.rollback();
                    System.out.println("Something went wrong, Try Again");
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
}




    /*
  Student table and SP details
Select * from Edureka.STUDENT;
CREATE TABLE Edureka.STUDENT(ID INT(10) AUTO_INCREMENT PRIMARY KEY,NAME Character(20),CLASS INT(10), MARKS INT(10));
CREATE PROCEDURE INSERTINTOSTUDENT (IN ID1 INT ,IN NAME1 VARCHAR(20),IN CLASS1 VARCHAR(20),IN MARKS1 INT)
BEGIN
INSERT INTO Edureka.STUDENT VALUES(ID1,NAME1,CLASS1,MARKS1);
END
     */