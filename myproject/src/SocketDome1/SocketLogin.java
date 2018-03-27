package SocketDome1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketLogin {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
				Socket so=new Socket("localhost", 800);
				OutputStream os=so.getOutputStream();
				String info="账户孔雷，密码k1990517";
				os.write(info.getBytes());
				
				InputStream is=so.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				info=null;
				while((info=br.readLine())!=null) {
					System.out.println("我是客户端"+info);
				}
				is.close();
				br.close();
				os.close();
				so.close();
	}

}
