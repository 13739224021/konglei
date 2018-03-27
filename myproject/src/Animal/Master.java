package Animal;

public class Master {
	public void feed(Pet pet) {
		pet.eat();
	}// public

	public Pet Pets(int i) {
		Pet pet = null;
		if (i == 1) {
			pet = new Dog();
			pet.eat();
		} else if (i == 2) {
			pet = new Cat();
			pet.eat();
		}
		return pet;
	}// public
	public void play(Pet pet,int id) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			if(id==1) {
			dog.dogPlay1();
			}else {
				dog.dogPlay();
			}
		} else if (pet instanceof Cat) {
			Cat cat = (Cat) pet;
			cat.catPlay();
		}
	}
}
