package FileInputStreamDome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader re=new FileReader("e:\\¶Á.txt");
		Writer wi=new FileWriter("e:\\Ð´.txt");
		BufferedReader bfr=new BufferedReader(re);
		BufferedWriter bfw=new BufferedWriter(wi);
		String str=null;
		while((str=bfr.readLine())!=null) {
			bfw.write(str);
			bfw.newLine();
			System.out.println(str);
		}
		bfw.flush();
		re.close();
		bfr.close();
		bfw.close();
		wi.close();
	}

}
