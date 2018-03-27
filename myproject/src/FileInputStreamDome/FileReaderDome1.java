package FileInputStreamDome;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fi=new FileReader("e:\\读.txt");
		FileWriter fo=new FileWriter("e:\\写.txt",true);
		int len;
		char []  i=new char[1];//存储读取到的数字
		while((len=fi.read(i))!=-1) {
			fo.write(i,0,len);
		}
		fi.close();
		fo.flush();
		fo.close();
	}

}
