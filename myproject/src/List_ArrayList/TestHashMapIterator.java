package List_ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMapIterator {

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
		//1.���� HashMap   ͨ��HashMap���key����  �� value��Ϣ
		Map dogMap=new HashMap();
		dogMap.put(dog1.getName(), dog1);
		dogMap.put(dog2.getName(), dog2);
		dogMap.put(dog3.getName(), dog3);
		//2ͨ��Iterator��ʽ����
		Set keys=dogMap.keySet();
		Iterator it=keys.iterator();
		System.out.println("ͨ����������ʽ����");
		while(it.hasNext()) {
			Object ob=it.next();
			Dog dogs=(Dog)dogMap.get(ob);
			System.out.println(ob);
			dogs.print();
		}
		System.out.println("ͨ��foreach����");
		for (Object ob : keys) {
			Dog dogs=(Dog)dogMap.get(ob);
			dogs.print();
		}
		}
	}


