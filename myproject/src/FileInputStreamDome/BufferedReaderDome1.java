package FileInputStreamDome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDome1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fi=new FileReader("e:\\��.txt");//����һ����ȡ�ַ���
		BufferedReader bf=new BufferedReader(fi);//BufferedReanderЧ�ʸ�
		String line=null;//���ܶ�ȡ������Ϣ
		while((line=bf.readLine())!=null) {//readLine()���ж�ȡ��Ч�ʸ�
			System.out.println(line);
		}
		fi.close();
		bf.close();
		
	}

}
