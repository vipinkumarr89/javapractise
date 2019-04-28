package EdurekaHW.module7;
import java.sql.*;
import java.util.Scanner;
public class CallingSP {
    public static void main(String[] args) {
        try {
            // Driver loading
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("DB Connection Started");
            //Creating Connection with DB
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql:/localhost:3306/Edureka", "root", "");
            // Testing Connection
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            System.out.println("Available Data in the Table Edureka");
            ResultSet resultSet = stmt.executeQuery("Select * from emp");
            while ((resultSet.next())) {
                System.out.println(resultSet.getInt(1) + "|" + resultSet.getString(2) + "|" + resultSet.getInt(3));
            }
            Thread.sleep(1000);
            System.out.println("Inserting Data using Store Procedure");
            System.out.println("Enter employee ID:");
            Scanner scanner = new Scanner(System.in);
            int empId = scanner.nextInt();
            System.out.println("Enter employeeName:");
            String eName = scanner.next();
            System.out.println("Enter Employee Salary:");
            int empSal = scanner.nextInt();
            try {
                //Create Callable Stmnt
                CallableStatement calstat = con.prepareCall("{CALL INSERTINTOEMP(?,?,?)}");
                calstat.setInt(1, empId);
                calstat.setString(2, eName);
                calstat.setInt(3, empSal);
                calstat.execute();
                System.out.println("Record uploading to DB...");
                Thread.sleep(2000);
                System.out.println("New Record Inserted into DB");
                //Checking for new Data
                resultSet = stmt.executeQuery("Select * from emp");
                while ((resultSet.next())) {
                    System.out.println(resultSet.getInt(1) + "|" + resultSet.getString(2) + "|" + resultSet.getInt(3));
                }
                con.commit();
            } catch (Exception e) {
                con.rollback();
                System.out.println(e);
            }
            con.close();
        } catch (Exception e1) {
            System.out.println(e1);
        }finally {
            System.out.println("Transaction completed");
        }
    }
}


/*DataBase details are here -
USE Edureka;
SELECT * FROM EDUREKA.EMP;

CREate table Edureka.emp (empno INT(10) AUTO_INCREMENT PRIMARY KEY, ename varchar(50), sal INT(10));
select * from emp;
INSERT INTO Edureka.emp values(101,'VIPIN', 10);
CREATE PROCEDURE INSERTINTOEMP (IN EMPNO1 INT, IN NAME1 VARCHAR(50), IN SAL1 INT)
begin
INSERT INTO Edureka.emp VALUES (EMPNO1,NAME1,SAL1);
end

CALL INSERTINTOEMP(102,"varun",10);
--drop procedure INSERTINTOEMP;
--DROP TABLE Edureka.emp;
delete from emp where empno = 103;
commit;
 */