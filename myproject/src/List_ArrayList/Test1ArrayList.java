package List_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test1ArrayList {

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
		ArrayList li=new ArrayList();
		li.add(dog1);
		li.add(dog2);
		li.add(2, dog3);
		
		System.out.println("**FORѭ������**");
		for (int i = 0; i <li.size(); i++) {
			Dog dogs=(Dog)li.get(i);
			dogs.print();
		}
		System.out.println("**foreach����*");
		for (Object object : li) {
			((Dog)object).print();
		}
		
		
	}

}
