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
		ServerSocket ss=new ServerSocket(799);//创建服务器端
		 
		while(true) {
			Socket sk=ss.accept();//监听
			SocketThreadDome std=new SocketThreadDome(sk);//创建线程对象，并传入有参构造的值
			std.start();//启动线程
			
		}

		
	}

}
