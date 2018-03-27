package ThreanDome1;

public class MyThread extends Thread {
	
	
	public void run() {//线程继承Runnable接口，Runnable接口里有个run()抽象方法，实现Thread类必须实现该方法
		for (int i = 0; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getName()+"----"+(i+1));
			
		}
	}

}
