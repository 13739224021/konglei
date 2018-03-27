package FileInputStreamDome;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fwi = new FileWriter("e:\\Ð´.txt",true);
		
		String o="ÎÒ°®ËÞÖÝ123";
	   fwi.write(o);
	   fwi.close();
		
	}

}
