package ThreanDome1;

public class ThreadTest1 {
	public static void main(String[] args) {
		//1
		Thread t=Thread.currentThread();//��ȡ���̶߳���
		System.out.println("��ǰ�߳���Ϊ:"+t.getName());//��ȡ���߳�����
		t.setName("Konglei");//�����������߳�����
		System.out.println("�������ֺ���߳���"+t.getName());//��ʾ�������ú�����߳�����
		//2
		MyThread m=new MyThread();//��ȡ���̶߳���
		MyThread m1=new MyThread();//��ȡ���̶߳���
		m.start();//�������̷߳���
		m1.start();
	}
}
