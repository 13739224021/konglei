package List_ArrayList;

import java.util.*;

public class TestLinkedList1 {

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
		LinkedList li=new LinkedList();
		li.add(dog1);
		li.add(dog2);
		li.addLast(dog3);
		
		
		System.out.println("***方法1**");
		for (int i = 0; i <li.size(); i++) {
			Object ob=li.get(i);
			Dog dogs=(Dog)ob;
			dogs.print();
		}
		System.out.println("**方法2***");//foreach
		
		for (Object object : li) {
			((Dog)object).print();
		}
		System.out.println("第一个狗");
		((Dog)li.getFirst()).print();
		System.out.println("删除最后一个狗后");
		li.removeLast();
		for (Object object : li) {
			((Dog)object).print();
		}
		//
		System.out.println("查找冬冬在不在");
		//contians 包含  搜索 对象 还在不在
		if (li.contains(dog3)) {
			System.out.println("冬冬存在");
		}else {
			System.out.println("冬冬不存在");
		}
	}

	private static boolean contains(Dog dog3) {
		// TODO Auto-generated method stub
		return false;
	}

}
