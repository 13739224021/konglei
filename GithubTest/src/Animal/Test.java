package Animal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��̬1.��д
			Dog dog=new Dog();
			dog.eat();
			Cat cat=new Cat();
			cat.eat();
			//��̬2.�������βΣ�������ʵ��
			Master ma=new Master();
			ma.feed(dog);
			ma.feed(cat);
			//��̬3.����෵��ֵ
			ma.Pets(1);
			ma.Pets(2);
			//��̬4��ǿ��ת��instanceof
			ma.play(dog, 1);
			ma.play(cat, 1);
	}

}
