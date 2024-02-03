package busreservation;
import java.sql.*;
public class Dbconnection {
private static final	String url = "jdbc:mysql://localhost:3306/busresv";  // table details
private static final	String username = "root"; 
private static final String password = "delli037";


   public static Connection getConnection() throws SQLException{
    	return DriverManager.getConnection(url,username,password);
    }
}



