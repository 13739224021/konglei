import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class serializableTest1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student stu=new Student("孔雷", 27, "男");
		OutputStream os=new FileOutputStream("e:\\student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		InputStream is=new FileInputStream("e:\\student.txt");
		ObjectInputStream ois=new ObjectInputStream(is);
		oos.writeObject(stu);
		Student stu2=(Student)ois.readObject();
		System.out.println("姓名"+stu2.getName()+"年级"+stu2.getAge()+"性别"+stu2.getSex());
		ois.close();
		os.close();
		oos.close();
		is.close();
	}

}
