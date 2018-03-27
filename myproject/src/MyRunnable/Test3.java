package MyRunnable;

public class Test3 implements Runnable{

	@Override
	public void run() {
		System.out.println("线程运行状态");
		try {
			Thread.sleep(200);//线程休眠。sleep  单位毫秒
			System.out.println("线程休眠状态-阻塞");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("线程死亡");
		}
		
	}
		public static void main(String[] args) {
			Thread t=new Thread(new Test3(),"konglei");
			System.out.println(t.getName()+"创建线程");
			t.start();
			System.out.println("线程就绪");
		}
}
