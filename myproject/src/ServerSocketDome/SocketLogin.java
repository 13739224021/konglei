package ServerSocketDome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketLogin {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
				Socket sk=new Socket("localhost", 799);//�����ͻ��ˣ�ָ��IP,��������
				OutputStream os=sk.getOutputStream();//�������
				InputStream is=sk.getInputStream();//��������
				User user=new User();//��������
				user.setMima("0000");//���ö�������
				user.setName("Tom");//���ö����˻�
				ObjectOutputStream oos=new ObjectOutputStream(os);//�������������
				oos.writeObject(user);//д������
				sk.shutdownOutput();
				String info=null;
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				while((info=br.readLine())!=null) {
					System.out.println("���ǿͻ���     "+info);
				}
				os.close();//�ر���
				sk.close();
	}

}
