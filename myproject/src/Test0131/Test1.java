package Test0131;

public class Test1 implements Runnable {
	int piao = 10;// Ʊ������
	int num = 0;// ʣ�������

	public void run() {
		while (true) {
			synchronized (this) {// ͬ������� ��֤�̰߳�ȫ�����ᱻ����߳�ͬʱ�޸�����
				if (piao <= 0) {
					break;
				} // if
				piao--;
				num++;
				System.out.println(Thread.currentThread().getName() + "�����˵�" + num + "��Ʊ����ʣ��" + piao + "��Ʊ");
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
