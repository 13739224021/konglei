package MyRunnable;

public class Test3 implements Runnable{

	@Override
	public void run() {
		System.out.println("�߳�����״̬");
		try {
			Thread.sleep(200);//�߳����ߡ�sleep  ��λ����
			System.out.println("�߳�����״̬-����");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�߳�����");
		}
		
	}
		public static void main(String[] args) {
			Thread t=new Thread(new Test3(),"konglei");
			System.out.println(t.getName()+"�����߳�");
			t.start();
			System.out.println("�߳̾���");
		}
}
