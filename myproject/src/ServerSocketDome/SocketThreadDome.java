package ServerSocketDome;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketThreadDome extends Thread{//�����߳���
		Socket sk=null; //����Socket
		public SocketThreadDome(Socket sk) {  //�вι���
			this.sk=sk;
		}		
		public void run() {
			InputStream is;
			try {
				is = sk.getInputStream();
				OutputStream os=sk.getOutputStream();//�����������˵������
				ObjectInputStream ois=new ObjectInputStream(is);//��������������
				User us=(User)ois.readObject();//���ն���
				System.out.println("���Ƿ�����  "+"�˻�  "+us.getName()+"����  "+us.getMima());
				sk.shutdownInput();
				String info="��¼�ɹ�";
				os.write(info.getBytes());//�������˷������ͻ���
				
				os.close();
				//�ر���
				is.close();
				sk.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//�����������˵�������
 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
