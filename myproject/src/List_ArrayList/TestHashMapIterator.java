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
		//1.声明 HashMap   通过HashMap添加key姓名  和 value信息
		Map dogMap=new HashMap();
		dogMap.put(dog1.getName(), dog1);
		dogMap.put(dog2.getName(), dog2);
		dogMap.put(dog3.getName(), dog3);
		//2通过Iterator方式遍历
		Set keys=dogMap.keySet();
		Iterator it=keys.iterator();
		System.out.println("通过迭代器方式遍历");
		while(it.hasNext()) {
			Object ob=it.next();
			Dog dogs=(Dog)dogMap.get(ob);
			System.out.println(ob);
			dogs.print();
		}
		System.out.println("通过foreach遍历");
		for (Object ob : keys) {
			Dog dogs=(Dog)dogMap.get(ob);
			dogs.print();
		}
		}
	}


