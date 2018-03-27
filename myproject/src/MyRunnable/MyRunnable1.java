package MyRunnable;

public class MyRunnable1 implements Runnable {

	@Override
	public void run() {
	for (int i = 1; i <101; i++) {
		System.out.println(Thread.currentThread().getName()+"---"+i);
	}
		
	}

}
