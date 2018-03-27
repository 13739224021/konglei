package Fuxi;

public class Master {
	// 多态1 父类做形参
	public void feed(Pet pet) {
		pet.eat();
	}// Public
		// 多态2 父类做返回值

	public Pet play1(int i) {
		if (i == 1) {
			Dog dog = new Dog();
			dog.dogPlay();
		} else if (i == 2) {
			Cat cat = new Cat();
			cat.catPlay();
		}
		return null;
	}
	//多态3 强制转换instanceof
	 public void play(Pet pet) {
		 if (pet instanceof Dog) {
			Dog dog=(Dog)pet;
			dog.dogPlay();
		}else if(pet instanceof Cat) {
			Cat cat=(Cat)pet;
			cat.catPlay();
		}
		 
	 }
}
