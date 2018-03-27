package Test0131;

public class Test2 implements Runnable {
	int piao = 10;// 记录票的数量
	int num = 0;// 记录剩余票的数量

	@Override
	public  void run() {
		synchronized(this) {
		while (true) {
			if(piao<=0) {
				break;
			}
			piao--;
			num++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "     购买了第" + num + "张" + "票,还剩" + piao + "张票");
		} // while
		}
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Test2 r=new Test2();
		Thread t1 = new Thread(r,"P1");
		Thread t2 = new Thread(r,"P2");
		Thread t3 = new Thread(r,"P3");
		t1.start();
		t2.start();
		t3.start();
	}

}
