package ThreanDome1;

public class MyThread extends Thread {
	
	
	public void run() {//�̼̳߳�Runnable�ӿڣ�Runnable�ӿ����и�run()���󷽷���ʵ��Thread�����ʵ�ָ÷���
		for (int i = 0; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getName()+"----"+(i+1));
			
		}
	}

}
