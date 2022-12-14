import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ktg", "root", "rpsconsulting");
		// create the statement
		Statement stmt = conn.createStatement();
		// execute the query DDL-->execute(),DML-->executeUpdate(),DRL,-->executeQuery
		ResultSet result = stmt.executeQuery("select * from ktgemps");
		while (result.next()) {
			System.out.println(result.getInt(1) + " " + result.getString("ename") + " " + result.getInt(3));
		}
		// close the connection
		conn.close();

	}
}
