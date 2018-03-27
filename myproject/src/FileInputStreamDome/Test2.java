package FileInputStreamDome;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream di = new DataInputStream(new FileInputStream("e:\\800M站点清单-亳州20170414-孔雷.xlsx"));
		DataOutputStream doo = new DataOutputStream(new FileOutputStream("e:\\3.xlsx"));
		int len;
		while ((len = di.read()) != -1) {
			doo.write(len);
		
		}
		
		System.out.println("OK");
		di.close();
		doo.flush();
		doo.close();
	}

}
