package FileInputStreamDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome3Fuzhi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("e:\\��.txt"); // ���������
		FileOutputStream fo = new FileOutputStream("e:\\д.txt", true); // ���������
		byte[] word = new byte[1];// �����ֽ�����        ��������鳤����>1�Ļ� �кܶ�ո�
		while ((fi.read(word)) != -1) {// �ж��������������Ϣ��Ϊ�� ѭ����
			System.out.print(new String(word));// ����������Ϣ
			fo.flush();// ˢ�»�����
			fo.write(word,0,word.length);//д���մ������Ϣ     ���������Ǹ���
		}
		fi.close();// �ر����루������
		fo.close();// �ر������д����
	}

}
