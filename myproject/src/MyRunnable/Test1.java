package MyRunnable;

public class Test1 {
	public static void main(String[] args) {
			Runnable a=new MyRunnable1();   //ʵ��Runnable�ӿڵ��� ʵ����
			Thread t=new Thread(a,"konglei");//����Thread�̶߳���  ��ʵ��Runnable�ӿڵ���Ķ��� ������   a,"konglei"���޸��Ǹ��̵߳�����
			Thread k=new Thread(a);
			t.start();
			k.start();
	}
}
