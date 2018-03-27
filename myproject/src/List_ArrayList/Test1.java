package List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

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
		ArrayList lis=new ArrayList();
		lis.add(dog1);
		lis.add(dog2);
		lis.add(dog3);
		System.out.println("For循环遍历");
		for (int i = 0; i < lis.size(); i++) {
			Object ob=lis.get(i);
			Dog dogs=(Dog)ob;
			dogs.print();
		}
		System.out.println("foreach遍历");
		for (Object object : lis) {
			((Dog)object).print();
		}
		lis.remove(dog2);
		System.out.println("Iterator迭代器遍历");
		Iterator it=lis.iterator();
		while(it.hasNext()) {
			Dog dogs=(Dog)it.next();
			dogs.print();
		}
		if (lis.contains(dog2)) {
			System.out.println("萌萌在");
		}else {
			System.out.println("萌萌不在");
		}
	}

}
