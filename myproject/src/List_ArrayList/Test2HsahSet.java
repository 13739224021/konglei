package List_ArrayList;

import java.util.*;

public class Test2HsahSet {

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
		System.out.println("*****foreach遍历*****");
		for (Object object : set) {
			((Dog)object).print();
		}//foreach
		System.out.println("******Iterator遍历******");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
					}//while
		System.out.println("*****去除性别为母的******");
		it=set.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			if (dogs.getSex().equals("母")) {
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
