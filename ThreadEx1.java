
public class ThreadEx1 extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());//thread-0
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());//1-10 main,5
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("sandeep");
		System.out.println(Thread.currentThread().getPriority());
		ThreadEx1 obj = new ThreadEx1();
		obj.start();
		ThreadEx1 obj1 = new ThreadEx1();
		obj1.start();
		
		for (int  i= 0;  i< 10; i++) {
			System.out.println("main thread");
		}
	}

}
