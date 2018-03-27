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
		Socket soc = ser.accept();// 2监听
		// 3打开输入流，接受用户请求
		InputStream is = soc.getInputStream();
		BufferedReader re = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while ((info = re.readLine()) != null) {
			System.out.println("我是服务器端,客户端信息是" + info);
		}
		// 服务器给客户端反馈
		OutputStream os = soc.getOutputStream();
		info = "欢饮您，登录成功";
		os.write(info.getBytes());
		
		os.close();
		// 4关闭
		re.close();
		is.close();
		soc.close();
		ser.close();

	}

}
