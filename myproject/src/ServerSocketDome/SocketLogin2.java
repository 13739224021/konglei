package ServerSocketDome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketLogin2 {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
				Socket sk=new Socket("localhost", 799);//创建客户端，指定IP,服务器端
				OutputStream os=sk.getOutputStream();//创建输出
				InputStream is=sk.getInputStream();//创建输入
				User user=new User();//创建对象
				user.setMima("1234");
				user.setName("cat");
				ObjectOutputStream oos=new ObjectOutputStream(os);
				oos.writeObject(user);
				sk.shutdownOutput();
				System.out.println("**********");
				System.out.println(sk.toString());
				os.close();//关闭流
				sk.close();
	}

}
