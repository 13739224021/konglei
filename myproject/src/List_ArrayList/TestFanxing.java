package List_ArrayList;
import java.util.*;
public class TestFanxing {

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
		dogMap.put(dog1.getName(), dog1);
		dogMap.put(dog2.getName(), dog2);
		dogMap.put(dog3.getName(), dog3);
		System.out.println("Iterator遍历");
		Set<String> keys=dogMap.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			dogMap.get(it.next()).print();
		}
		System.out.println("foreach遍历");
		for (String string : keys) {
			dogMap.get(string).print();
		}
	}

}
