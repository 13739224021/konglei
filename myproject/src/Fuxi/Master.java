package Fuxi;

public class Master {
	// ��̬1 �������β�
	public void feed(Pet pet) {
		pet.eat();
	}// Public
		// ��̬2 ����������ֵ

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
	//��̬3 ǿ��ת��instanceof
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
