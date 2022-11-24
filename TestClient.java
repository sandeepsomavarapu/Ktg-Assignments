import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Employee emp = new Employee(111, "sandeep", 1000, "hyderabad");
//		System.out.println(emp);
//		// serialization
//
//		FileOutputStream out = new FileOutputStream("EmployeesInfo.txt");
//		ObjectOutputStream out1 = new ObjectOutputStream(out);
//		out1.writeObject(emp);
//		System.out.println("employee added to file");
		
		//de-serialization
		
		FileInputStream input = new FileInputStream("EmployeesInfo.txt");
		ObjectInputStream input1 = new ObjectInputStream(input);
		Employee emp1 = (Employee) input1.readObject();
		System.out.println(emp1);

	}
}
