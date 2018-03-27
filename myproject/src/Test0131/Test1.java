package Test0131;

public class Test1 implements Runnable {
	int piao = 10;// 票的数量
	int num = 0;// 剩余的数量

	public void run() {
		while (true) {
			synchronized (this) {// 同步代码块 保证线程安全，不会被多个线程同时修改数据
				if (piao <= 0) {
					break;
				} // if
				piao--;
				num++;
				System.out.println(Thread.currentThread().getName() + "抢到了第" + num + "张票，还剩余" + piao + "张票");
			} // synchronized (this)
		} // while
	}// run

	public static void main(String[] args) {
		Test1 ran = new Test1();
		Thread p1 = new Thread(ran, "P1");
		Thread p2 = new Thread(ran, "P2");
		Thread p3 = new Thread(ran, "P3");
		p1.start();
		p2.start();
		p3.start();
	}
}// class
