package List_ArrayList;

import java.util.*;

public class Test2HsahSet {

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
		System.out.println("*****foreach����*****");
		for (Object object : set) {
			((Dog)object).print();
		}//foreach
		System.out.println("******Iterator����******");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
					}//while
		System.out.println("*****ȥ���Ա�Ϊĸ��******");
		it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			if (dogs.getSex().equals("ĸ")) {
				it.remove();
			}
		}//while
		it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
		}
	}

}
