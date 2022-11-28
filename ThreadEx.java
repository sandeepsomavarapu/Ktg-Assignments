
public class ThreadEx implements Runnable  {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

	public static void main(String[] args) {
		ThreadEx obj = new ThreadEx();
		Thread th=new Thread(obj);
		th.start();//run method

	}

}
