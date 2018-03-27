package FileInputStreamDome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader ri=new FileReader("e:\\¶Á.txt");
		BufferedReader br=new BufferedReader(ri);
		Writer fw=new FileWriter("e:\\Ð´.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		String str;
		while((str=br.readLine())!=null) {
			bw.write(str,0,str.length());	
			bw.newLine();
		}
		
		ri.close();
		br.close();
		bw.flush();
		fw.close();
		bw.close();
	}

}
