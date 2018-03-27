package List_ArrayList;

import java.util.*;

public class TestHashSet11112 {

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
		Set set=new HashSet();
		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		
		System.out.println("****使用foreach遍历*****");
		for (Object object : set) {
			((Dog)object).print();
		}
		System.out.println("*****set.remove删除后用foreach遍历*****");
		set.remove(dog2);
		for (Object object : set) {
			((Dog)object).print();
		}
		System.out.println("****使用Iteratol遍历****");
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
		}
		System.out.println("****使用remove删除性别为公后****");
		 it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			if(dogs.getSex().equals("公")) {
				it.remove();
			}
		}//while
		 it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
			if (set.contains(dog3)) {
				System.out.println("冬冬还在");
			}else {
				System.out.println("冬冬不在");
			}
		}
		System.out.println(set.size());//集合长度
		}
		
	}


