package DatagramPacketDome;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Computer1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String miss="你好，我是电脑1";
		DatagramPacket dp=new DatagramPacket(miss.getBytes(), miss.getBytes().length, InetAddress.getByName("localhost"), 777);
		DatagramSocket ds=new DatagramSocket();
		ds.send(dp);
	}

}
