package EdurekaHW.module7;
import java.sql.*;
public class JdbcConnection {
    public static void main(String[] args) {


        try {
            // Driver loading
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("DB Connection Started");

            //Creating Connection with DB
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/edureka", "root", "password");

            // Testing Connection
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("Select Now()");
            while ((resultSet.next())){
                System.out.println(resultSet.getInt(1));
            }
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
