package MyRunnable;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Runnable r=new MyRunnable2();
			Thread t=new Thread(r);
			t.start();
	}

}
