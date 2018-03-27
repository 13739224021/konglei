package FileInputStreamDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome3Fuzhi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("e:\\读.txt"); // 定义读入流
		FileOutputStream fo = new FileOutputStream("e:\\写.txt", true); // 定义输出流
		byte[] word = new byte[1];// 定义字节数组        ？如果数组长度是>1的话 有很多空格
		while ((fi.read(word)) != -1) {// 判断如果穿过来的信息不为空 循环传
			System.out.print(new String(word));// 输出传入的信息
			fo.flush();// 刷新缓冲区
			fo.write(word,0,word.length);//写出刚传入的信息     ！！！就是复制
		}
		fi.close();// 关闭输入（读）流
		fo.close();// 关闭输出（写）流
	}

}
