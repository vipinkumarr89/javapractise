package EdurekaHW.module7;
import java.sql.Connection;
public class ConnectionTesting {
    public static void main(String[] args) throws Exception {
        Connection con = ConnectionFactory.getDBConnection();
        if(con.getAutoCommit()){
            System.out.println("Connection Succeed");
        }else
            System.out.println("Connection failed");

       con.close();

    }
}
