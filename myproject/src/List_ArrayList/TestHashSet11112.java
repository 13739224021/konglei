package List_ArrayList;

import java.util.*;

public class TestHashSet11112 {

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
		Set set=new HashSet();
		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		
		System.out.println("****ʹ��foreach����*****");
		for (Object object : set) {
			((Dog)object).print();
		}
		System.out.println("*****set.removeɾ������foreach����*****");
		set.remove(dog2);
		for (Object object : set) {
			((Dog)object).print();
		}
		System.out.println("****ʹ��Iteratol����****");
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
		}
		System.out.println("****ʹ��removeɾ���Ա�Ϊ����****");
		 it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			if(dogs.getSex().equals("��")) {
				it.remove();
			}
		}//while
		 it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
			if (set.contains(dog3)) {
				System.out.println("��������");
			}else {
				System.out.println("��������");
			}
		}
		System.out.println(set.size());//���ϳ���
		}
		
	}


