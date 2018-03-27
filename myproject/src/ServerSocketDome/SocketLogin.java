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
				Socket sk=new Socket("localhost", 799);//创建客户端，指定IP,服务器端
				OutputStream os=sk.getOutputStream();//创建输出
				InputStream is=sk.getInputStream();//创建输入
				User user=new User();//创建对象
				user.setMima("0000");//设置对象密码
				user.setName("Tom");//设置对象账户
				ObjectOutputStream oos=new ObjectOutputStream(os);//创建对象输出流
				oos.writeObject(user);//写出对象
				sk.shutdownOutput();
				String info=null;
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				while((info=br.readLine())!=null) {
					System.out.println("我是客户端     "+info);
				}
				os.close();//关闭流
				sk.close();
	}

}
