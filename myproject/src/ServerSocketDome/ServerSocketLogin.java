package ServerSocketDome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketLogin {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket ss=new ServerSocket(799);//������������
		 
		while(true) {
			Socket sk=ss.accept();//����
			SocketThreadDome std=new SocketThreadDome(sk);//�����̶߳��󣬲������вι����ֵ
			std.start();//�����߳�
			
		}

		
	}

}
