/**
 * 
 */
package List_ArrayList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 *LinkedList ��ArrayList�����ϼ��˵�һ�������һ�������/ɾ������
 */
public class TestLinkedList {

	private static final String Dog = null;

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
		Cat cat1=new Cat();
		cat1.setAge(4);
		cat1.setHealth(98);
		cat1.setName("����");
		cat1.setSex("ĸ");
		Cat cat2=new Cat();
		cat2.setAge(5);
		cat2.setHealth(18);
		cat2.setName("����");
		cat2.setSex("ĸ");
		//1��������
		LinkedList li=new LinkedList();
		LinkedList li1=new LinkedList();
		
		//2����/��� ����
		li.add(dog1);
		li.add(dog2);
		li.addFirst(dog3);
		li1.add(cat1);
		li1.addFirst(cat2);
		//3.1�������ϵ�һ�ַ���foreach
		System.out.println("һ��"+li.size()+"����");
		System.out.println("һ��"+li1.size()+"��è");
		System.out.println("***************��һ��**************");
		for (Object object : li) {
			((Dog)object).print();
			
		}
		for (Object object : li1) {
			((Cat)object).print();
			
		}
		//3.2�������ϵĵڶ��ַ���
		System.out.println("***************�ڶ���**************");
		for (int i = 0; i <li.size(); i++) {
			Object ob=li.get(i);
			Dog dogs=(Dog)ob;
			dogs.print();
		}
		System.out.println("��õ�һ��������Ϣ");
		((Dog)li.getFirst()).print();
		System.out.println("ɾ�����һ��������Ϣ��");
		li.removeLast();
		for (Object object : li) {
			((Dog)object).print();
		}
		System.out.println("��õ�һ��è����Ϣ");
		((Cat)li1.getFirst()).print();
	}
		
		
}
