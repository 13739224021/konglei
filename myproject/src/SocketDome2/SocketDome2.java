package SocketDome2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDome2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket sk=new Socket("localhost", 800);
		OutputStream os=sk.getOutputStream();
		String info="用户名;konglei ,密码:k1990517";
		os.write(info.getBytes());
		sk.shutdownOutput();
		InputStream is=sk.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		info=null;
		while((info=br.readLine())!=null) {
			System.out.println("我是客户端"+info);
		}
		is.close();
		br.close();
		os.close();
		sk.close();
		
		
		
	}

}
