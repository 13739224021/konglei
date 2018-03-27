package Testcollections;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("冬冬", 100, 90);
		Dog dog2 = new Dog("西西", 80, 80);
		Dog dog3 = new Dog("北北", 90, 70);
		Dog dog4 = new Dog("南南", 70, 96);
		ArrayList<Dog> li=new ArrayList<Dog>();
		li.add(dog1);
		li.add(dog2);
		li.add(dog3);
		li.add(dog4);
		System.out.println("for遍历");
		for (int i = 0; i < li.size(); i++) {
			Dog dogs=li.get(i);
			
			dogs.print();
		}
		System.out.println("foreach遍历");
		for (Dog object : li) {
			object.print();
		}
		System.out.println("Iterator遍历");
		Iterator<Dog> it=li.iterator();
		while (it.hasNext()) {
			Dog dogs=it.next();
			dogs.print();
		}
		
		
		
		
		
		
		
		
	}

}
