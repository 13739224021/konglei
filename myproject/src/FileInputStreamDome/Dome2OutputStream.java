package FileInputStreamDome;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Dome2OutputStream {
		public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("e:\\д.txt",true); 
		String str="�Ұ���˪˪";
		byte[] words=str.getBytes();
		fo.write(words);
		fo.flush();
		fo.close();
		
		}
}
