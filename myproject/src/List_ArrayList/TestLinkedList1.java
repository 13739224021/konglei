package List_ArrayList;

import java.util.*;

public class TestLinkedList1 {

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
		LinkedList li=new LinkedList();
		li.add(dog1);
		li.add(dog2);
		li.addLast(dog3);
		
		
		System.out.println("***����1**");
		for (int i = 0; i <li.size(); i++) {
			Object ob=li.get(i);
			Dog dogs=(Dog)ob;
			dogs.print();
		}
		System.out.println("**����2***");//foreach
		
		for (Object object : li) {
			((Dog)object).print();
		}
		System.out.println("��һ����");
		((Dog)li.getFirst()).print();
		System.out.println("ɾ�����һ������");
		li.removeLast();
		for (Object object : li) {
			((Dog)object).print();
		}
		//
		System.out.println("���Ҷ����ڲ���");
		//contians ����  ���� ���� ���ڲ���
		if (li.contains(dog3)) {
			System.out.println("��������");
		}else {
			System.out.println("����������");
		}
	}

	private static boolean contains(Dog dog3) {
		// TODO Auto-generated method stub
		return false;
	}

}
