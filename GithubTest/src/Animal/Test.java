package Animal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多态1.重写
			Dog dog=new Dog();
			dog.eat();
			Cat cat=new Cat();
			cat.eat();
			//多态2.父类做形参，子类做实参
			Master ma=new Master();
			ma.feed(dog);
			ma.feed(cat);
			//多态3.父类多返回值
			ma.Pets(1);
			ma.Pets(2);
			//多态4，强制转换instanceof
			ma.play(dog, 1);
			ma.play(cat, 1);
	}

}
