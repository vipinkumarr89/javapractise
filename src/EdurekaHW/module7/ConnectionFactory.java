package EdurekaHW.module7;
import java.sql.DriverManager;
import java.sql.Connection;
//import java.sql.SQLException;
import java.util.ResourceBundle;
//import java.util.Properties;

public class ConnectionFactory {
    private static Connection con = null;
    public static Connection getDBConnection() throws Exception {
        if (con == null) {

            ResourceBundle resourceBundle = ResourceBundle.getBundle("EdurekaHW/module7/db");

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
