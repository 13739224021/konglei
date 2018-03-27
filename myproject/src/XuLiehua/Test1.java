package XuLiehua;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Pet dog = new Pet("»¨»¨", 18, 88);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\student.txt"));

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:\\student.txt"));
		oos.writeObject(dog);
		Pet stu2 = (Pet) ois.readObject();
		System.out.println(stu2.getName() + " " + stu2.getAge() + " " + stu2.getLove());
		oos.flush();
		oos.close();

		ois.close();
	}

}
