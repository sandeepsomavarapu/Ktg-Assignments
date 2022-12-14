import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ktg", "root", "rpsconsulting");
		// create the statement
		Statement stmt = conn.createStatement();
		// execute the query DDL-->execute(),DML-->executeUpdate(),DRL,-->executeQuery
	//	int result=stmt.executeUpdate("insert into ktgemps values(123,'sandeep',9000)");
		int result=stmt.executeUpdate("update ktgemps set  esal=15000 where empid=123");
	//	int result=stmt.executeUpdate("delete from ktgemps where empid=123");
		// close the connection
		conn.close();
		System.out.println(result+" record updated ");
	}

}

