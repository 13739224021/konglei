package FileInputStreamDome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Dome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("e:\\¶Á.txt");
		int len;
		byte[] word=new byte[1024];
		while((len=fi.read(word))!=-1) {
			System.out.print(new String(word,0,len));
		}
		fi.close();
	}

}
