package ThreanDome1;

public class ThreadTest1 {
	public static void main(String[] args) {
		//1
		Thread t=Thread.currentThread();//获取主线程对象
		System.out.println("当前线程名为:"+t.getName());//获取主线程名字
		t.setName("Konglei");//重新设置主线程名字
		System.out.println("更改名字后的线程名"+t.getName());//显示重新设置后的主线程名字
		//2
		MyThread m=new MyThread();//获取该线程对象
		MyThread m1=new MyThread();//获取该线程对象
		m.start();//启动该线程方法
		m1.start();
	}
}
