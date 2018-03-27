package MyRunnable;

public class Test1 {
	public static void main(String[] args) {
			Runnable a=new MyRunnable1();   //实现Runnable接口的类 实例化
			Thread t=new Thread(a,"konglei");//定义Thread线程对象  用实现Runnable接口的类的对象 做参数   a,"konglei"是修改那个线程的名字
			Thread k=new Thread(a);
			t.start();
			k.start();
	}
}
