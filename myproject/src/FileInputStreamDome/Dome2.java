package FileInputStreamDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("e:\\��.txt");//����������
		FileOutputStream fo = new FileOutputStream("e:\\д.txt", true);//����д����
		byte[] words = new byte[1024];//����һ���ֽ�
		int len;//����һ��������������¼��ȡ�ĳ���
		while ((len=fi.read(words)) != -1) {//len��¼�˶�ȡ�ĳ��ȣ�fi.read(words))��ȡ����Ϣ
			fo.write(words, 0, len);//д����Ϣ
			System.out.println("���Ƴɹ�");
		}
		fo.flush();
		fi.close();
		fo.close();

	}

}
