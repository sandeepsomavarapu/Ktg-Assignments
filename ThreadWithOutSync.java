
class A1 {
	public synchronized void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class B extends Thread {
	String msg;
	A1 a;// has-a

	B(A1 fp, String str) {
		a = fp;
		msg = str;
		this.start();
	}

	public void run() {
		a.display(msg);
	}
}

public class ThreadWithOutSync {
	public static void main(String[] args) {
		A1 fnew = new A1();
		B ss = new B(fnew, "welcome");// has-a thread-0
		B ss1 = new B(fnew, "new");			// thread-1
		B ss2 = new B(fnew, "java programmer");//thread-2
	}
}