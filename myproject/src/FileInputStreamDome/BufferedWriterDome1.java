package FileInputStreamDome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedWriterDome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer fi = new FileWriter("e:\\д.txt", true);//����д���ַ���
		BufferedWriter bf = new BufferedWriter(fi);//����BufferedWtiter ��ǿ
		String str = "�Ұ��й�123";
		bf.write(str);//��BufferedWtiter����д��
		bf.newLine();//����
		bf.write("���ǿ���");
		bf.flush();// һ��Ҫ��ˢ��������BufferedWriter�������Ǵ��ڻ������� �������ˢ����ʾ����������
		fi.close();
		bf.close();

	}

}
