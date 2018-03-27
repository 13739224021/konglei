/**
 * 
 */
package List_ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *集合框架-ArrayList 
 */
public class TestArrayList {

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
		//1声明集合
		ArrayList li=new ArrayList();
		//2添加操作
		li.add(dog1);//装箱 索引号0  转成Object
		li.add(dog2);//索引号1
		li.add(2, dog3);//将dog3添加到集合 索引号0的位置 原来的索引号重新排列
		//3遍历方式1---索引号遍历
		for (int i = 0; i < li.size(); i++) {
			Object ob=li.get(i);
			Dog dogs=(Dog)ob;//Object---->Dog 拆箱
			dogs.print();
		}
		System.out.println("*************");
		li.set(0, dog3);
		for (Object object : li) {
			((Dog)object).print();
		}
		//5删除
		li.remove(2);
		//4遍历方式2---foreach遍历方式foreach
		System.out.println("*************");
		for (Object object : li) {
			((Dog)object).print();
		}
		//6.contains  包含，判断对象是否存在
		if (li.contains(dog3)) {
			System.out.println("冬冬存在");
		}else {
			System.out.println("冬冬不存在");
		}
		((Dog)li.get(1)).print();
	}

}
