package FileInputStreamDome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fi=new FileReader("e:\\读.txt");//定义一个读取字符流
		BufferedReader bf=new BufferedReader(fi);//BufferedReander效率高
		String line=null;//接受读取到的信息
		while((line=bf.readLine())!=null) {//readLine()按行读取，效率高
			System.out.println(line);
		}
		fi.close();
		bf.close();
		
	}

}
