package List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

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
		ArrayList lis=new ArrayList();
		lis.add(dog1);
		lis.add(dog2);
		lis.add(dog3);
		System.out.println("Forѭ������");
		for (int i = 0; i < lis.size(); i++) {
			Object ob=lis.get(i);
			Dog dogs=(Dog)ob;
			dogs.print();
		}
		System.out.println("foreach����");
		for (Object object : lis) {
			((Dog)object).print();
		}
		lis.remove(dog2);
		System.out.println("Iterator����������");
		Iterator it=lis.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
		}
		if (lis.contains(dog2)) {
			System.out.println("������");
		}else {
			System.out.println("���Ȳ���");
		}
	}

}
