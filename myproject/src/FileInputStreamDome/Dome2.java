package FileInputStreamDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("e:\\读.txt");//创建读入流
		FileOutputStream fo = new FileOutputStream("e:\\写.txt", true);//创建写出流
		byte[] words = new byte[1024];//定义一组字节
		int len;//定义一个变量，用来记录读取的长度
		while ((len=fi.read(words)) != -1) {//len记录了读取的长度，fi.read(words))读取了信息
			fo.write(words, 0, len);//写出信息
			System.out.println("复制成功");
		}
		fo.flush();
		fi.close();
		fo.close();

	}

}
