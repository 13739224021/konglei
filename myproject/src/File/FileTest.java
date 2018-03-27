package File;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException  {
		File file=new File("d:1.txt");
		if (file.exists()) {
			System.out.println("´æÔÚ");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.length());
		}else {
			System.out.println("²»´æÔÚ");
			file.createNewFile();
		}

	}

}
