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
		dog1.setName("多多");
		dog1.setPin("雪纳瑞");
		dog1.setSex("公");
		Dog dog2=new Dog();
		dog2.setAge(3);
		dog2.setName("萌萌");
		dog2.setPin("拉布拉多");
		dog2.setSex("母");
		Dog dog3=new Dog();
		dog3.setAge(5);
		dog3.setName("冬冬");
		dog3.setPin("拉拉多");
		dog3.setSex("母");
		Map<String, Dog> dogMap=new HashMap();
		dogMap.put("多多", dog1);
		dogMap.put("萌萌", dog2);
		dogMap.put("冬冬", dog3);
		dogMap.get("多多").print();
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
