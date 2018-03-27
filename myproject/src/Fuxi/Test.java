package Fuxi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cat cat=new Cat();
			Dog dog=new Dog();
			Master ma=new Master();
			ma.feed(dog);
			ma.feed(cat);
			ma.play1(1);
			ma.play1(2);
			ma.play(dog);
			ma.play(cat);
	}

}
