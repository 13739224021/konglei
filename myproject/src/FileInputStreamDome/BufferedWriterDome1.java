package FileInputStreamDome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedWriterDome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer fi = new FileWriter("e:\\写.txt", true);//定义写出字符流
		BufferedWriter bf = new BufferedWriter(fi);//定义BufferedWtiter 加强
		String str = "我爱中国123";
		bf.write(str);//用BufferedWtiter快速写出
		bf.newLine();//换行
		bf.write("我是孔雷");
		bf.flush();// 一定要冲刷缓冲区，BufferedWriter本来就是存在缓冲区的 如果不冲刷，显示不出来数据
		fi.close();
		bf.close();

	}

}
