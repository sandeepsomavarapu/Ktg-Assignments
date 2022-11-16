
class Parent {
	int age = 31;

	public void printAge() {

		System.out.println(age);
	}
}

public class Exercise1  extends Parent{
	int age = 30;

	public void printAge() {
		int age = 29;
		System.out.println(age+" "+this.age+" "+super.age);
		
	}
	
	public static void main(String[] args) {
		Exercise1 obj = new Exercise1();
		obj.printAge();

	}
}