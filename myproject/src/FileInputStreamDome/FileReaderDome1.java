package FileInputStreamDome;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fi=new FileReader("e:\\��.txt");
		FileWriter fo=new FileWriter("e:\\д.txt",true);
		int len;
		char []  i=new char[1];//�洢��ȡ��������
		while((len=fi.read(i))!=-1) {
			fo.write(i,0,len);
		}
		fi.close();
		fo.flush();
		fo.close();
	}

}
