package List_ArrayList;

import java.util.LinkedList;

public class Test3LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
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
			li.addFirst(dog1);
			li.addFirst(dog2);
			li.addFirst(dog3);
			for (Object object : li) {
				((Dog)object).print();
			}
			System.out.println("******");
			for (int i = 0; i <li.size(); i++) {
				Dog dogs=(Dog)li.get(i);
				dogs.print();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
