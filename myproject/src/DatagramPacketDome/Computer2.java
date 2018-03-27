package DatagramPacketDome;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Computer2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[]  by=new byte[1024];
		DatagramPacket dgp=new DatagramPacket(by, by.length);
		DatagramSocket dgs=new DatagramSocket();
		dgs.receive(dgp);
		String ss=new String(dgp.getData(), 0, dgp.getLength());
		System.out.println(dgp.getAddress()+"˵ "+ss);
	}

}
