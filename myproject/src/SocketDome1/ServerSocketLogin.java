package SocketDome1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketLogin {

	public static void main(String[] args) throws IOException {
		ServerSocket ser = new ServerSocket(800);
		Socket soc = ser.accept();// 2����
		// 3���������������û�����
		InputStream is = soc.getInputStream();
		BufferedReader re = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while ((info = re.readLine()) != null) {
			System.out.println("���Ƿ�������,�ͻ�����Ϣ��" + info);
		}
		// ���������ͻ��˷���
		OutputStream os = soc.getOutputStream();
		info = "����������¼�ɹ�";
		os.write(info.getBytes());
		
		os.close();
		// 4�ر�
		re.close();
		is.close();
		soc.close();
		ser.close();

	}

}
