
public class CLient {
public static void main(String[] args) {
	Employee emp=new Employee(123,"suresh", 9000,"hyderabad");
	
	emp.setEmpName("naresh");
	
	System.out.println(emp.getEmpId()+" "+emp.getEmpName());
	
	
	System.out.println(emp.toString());//address  Object -->toString
}
}
