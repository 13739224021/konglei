/**
 * 
 */
package List_ArrayList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 *LinkedList 在ArrayList基础上加了第一个和最后一个的添加/删除方法
 */
public class TestLinkedList {

	private static final String Dog = null;

	/**
	 * @param args
	 */
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
		Cat cat1=new Cat();
		cat1.setAge(4);
		cat1.setHealth(98);
		cat1.setName("咪咪");
		cat1.setSex("母");
		Cat cat2=new Cat();
		cat2.setAge(5);
		cat2.setHealth(18);
		cat2.setName("喵喵");
		cat2.setSex("母");
		//1声明集合
		LinkedList li=new LinkedList();
		LinkedList li1=new LinkedList();
		
		//2操作/添加 集合
		li.add(dog1);
		li.add(dog2);
		li.addFirst(dog3);
		li1.add(cat1);
		li1.addFirst(cat2);
		//3.1遍历集合第一种方法foreach
		System.out.println("一共"+li.size()+"个狗");
		System.out.println("一共"+li1.size()+"个猫");
		System.out.println("***************第一种**************");
		for (Object object : li) {
			((Dog)object).print();
			
		}
		for (Object object : li1) {
			((Cat)object).print();
			
		}
		//3.2遍历集合的第二种方法
		System.out.println("***************第二种**************");
		for (int i = 0; i <li.size(); i++) {
			Object ob=li.get(i);
			Dog dogs=(Dog)ob;
			dogs.print();
		}
		System.out.println("获得第一个狗的信息");
		((Dog)li.getFirst()).print();
		System.out.println("删除最后一个狗的信息后");
		li.removeLast();
		for (Object object : li) {
			((Dog)object).print();
		}
		System.out.println("获得第一个猫的信息");
		((Cat)li1.getFirst()).print();
	}
		
		
}
