
public class ThreadEx2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadEx2 obj = new ThreadEx2();
		obj.start();
		obj.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

}
