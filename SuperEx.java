
class ParentEx {
	static int a = 10;

	public ParentEx() {
		this(111);
		System.out.println("dafault constructor of parent");
	}

	ParentEx(int a) {

		System.out.println("Parent class parameterized constuructor" + a);
	}

	public void m1() {
		System.out.println("parent class method");
	}
}

class SuperEx extends ParentEx {
	static int a = 20;

	SuperEx() {
		super();// parent class constructor calling ()
		super.m1();// parent method calling
		this.m1();// current class method calling
		System.out.println(this.a);// 20
		System.out.println(super.a);// 10
		System.out.println(this);// current class object
		System.out.println("child class constuructor");
	}

	public void m1() {
		System.out.println("child class method");
	}

	public static void main(String args[]) {
		SuperEx e = new SuperEx();// default constructor heap area
		System.out.println(e);// object address toString()
		ParentEx p = new ParentEx(12);// param constrcutor
	}
}