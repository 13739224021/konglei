/**
 * 
 */
package List_ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *���Ͽ��-ArrayList 
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		dog1.setAge(1);
		dog1.setName("���");
		dog1.setPin("ѩ����");
		dog1.setSex("��");
		Dog dog2=new Dog();
		dog2.setAge(3);
		dog2.setName("����");
		dog2.setPin("��������");
		dog2.setSex("ĸ");
		Dog dog3=new Dog();
		dog3.setAge(5);
		dog3.setName("����");
		dog3.setPin("������");
		dog3.setSex("ĸ");
		//1��������
		ArrayList li=new ArrayList();
		//2��Ӳ���
		li.add(dog1);//װ�� ������0  ת��Object
		li.add(dog2);//������1
		li.add(2, dog3);//��dog3��ӵ����� ������0��λ�� ԭ������������������
		//3������ʽ1---�����ű���
		for (int i = 0; i < li.size(); i++) {
			Object ob=li.get(i);
			Dog dogs=(Dog)ob;//Object---->Dog ����
			dogs.print();
		}
		System.out.println("*************");
		li.set(0, dog3);
		for (Object object : li) {
			((Dog)object).print();
		}
		//5ɾ��
		li.remove(2);
		//4������ʽ2---foreach������ʽforeach
		System.out.println("*************");
		for (Object object : li) {
			((Dog)object).print();
		}
		//6.contains  �������ж϶����Ƿ����
		if (li.contains(dog3)) {
			System.out.println("��������");
		}else {
			System.out.println("����������");
		}
		((Dog)li.get(1)).print();
	}

}
