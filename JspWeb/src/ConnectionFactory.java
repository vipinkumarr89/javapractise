import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ResourceBundle;

public class ConnectionFactory {
    private static Connection con = null;
    public static Connection getDBConnection() throws Exception {
        if (con == null) {

            ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

            String URL = resourceBundle.getString("url");
            String user = resourceBundle.getString("username");
            String passwd = resourceBundle.getString("password");
            String driverclass = resourceBundle.getString("driverclass");
            Class.forName(driverclass);
            con = DriverManager.getConnection(URL, user, passwd);
        }
        return con;
    }
}
