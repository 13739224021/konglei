package List_ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test9HashMap {

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
		dogMap.put("���", dog1);
		dogMap.put("����", dog2);
		dogMap.put("����", dog3);
		dogMap.get("���").print();
		System.out.println(dogMap.keySet());
		System.out.println(dogMap.size());
		Set<String> keys=dogMap.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			dogMap.get(it.next()).print();
		}
		for (String string : keys) {
			dogMap.get(string).print();
		}
	    
	}

}
