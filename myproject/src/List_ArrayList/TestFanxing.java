package List_ArrayList;
import java.util.*;
public class TestFanxing {

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
		Map<String, Dog> dogMap=new HashMap();
		dogMap.put(dog1.getName(), dog1);
		dogMap.put(dog2.getName(), dog2);
		dogMap.put(dog3.getName(), dog3);
		System.out.println("Iterator����");
		Set<String> keys=dogMap.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			dogMap.get(it.next()).print();
		}
		System.out.println("foreach����");
		for (String string : keys) {
			dogMap.get(string).print();
		}
	}

}
