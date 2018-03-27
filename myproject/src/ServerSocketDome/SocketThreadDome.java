package ServerSocketDome;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketThreadDome extends Thread{//创建线程类
		Socket sk=null; //定义Socket
		public SocketThreadDome(Socket sk) {  //有参构造
			this.sk=sk;
		}		
		public void run() {
			InputStream is;
			try {
				is = sk.getInputStream();
				OutputStream os=sk.getOutputStream();//创建服务器端的输出流
				ObjectInputStream ois=new ObjectInputStream(is);//创建对象输入流
				User us=(User)ois.readObject();//接收对象
				System.out.println("我是服务器  "+"账户  "+us.getName()+"密码  "+us.getMima());
				sk.shutdownInput();
				String info="登录成功";
				os.write(info.getBytes());//服务器端反馈给客户端
				
				os.close();
				//关闭流
				is.close();
				sk.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//创建服务器端的输入流
 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
