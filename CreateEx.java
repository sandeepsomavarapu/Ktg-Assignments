import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ktg", "root", "rpsconsulting");
		// create the statement
		Statement stmt = conn.createStatement();
		// execute the query DDL-->execute(),DML-->executeUpdate(),DRL,-->executeQuery
		stmt.execute("create table ktgemps1(empid int primary key,ename varchar(10),esal int)");
		// close the connection
		conn.close();
		System.out.println("Table Created ");
	}

}
