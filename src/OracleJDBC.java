wimport java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
 
public class OracleJDBC {
 
	public static void main(String[] argv) throws SQLException {
 
		System.out.println("-------- Oracle JDBC Connection Testing ------");
 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
 
		System.out.println("Oracle JDBC Driver Registered!");
		Connection connection = null;
 
		try {

			connection = DriverManager.getConnection("jdbc:oracle:thin:@sl02195:1522:EDSCM", "JBOSS_OPS_NEW","JBO55_N3w");
 
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
			connection.close();
		} else {
			System.out.println("Failed to make connection!");
		}
	}
 
}