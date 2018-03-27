package SocketDome2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTset1 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(800);
		Socket so = ss.accept();
		BufferedReader bf = new BufferedReader(new InputStreamReader(so.getInputStream()));
		String info = null;
		while ((info = bf.readLine()) != null) {
			System.out.println("我是客户端         " + info);
		}
		so.shutdownInput();
		OutputStream os = so.getOutputStream();

		info = "欢饮您，登录成功";
		os.write(info.getBytes());

		os.close();
		bf.close();
		so.close();
		ss.close();

	}

}
