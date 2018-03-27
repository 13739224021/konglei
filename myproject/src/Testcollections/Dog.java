package Testcollections;

public class Dog extends Pet {

	public Dog(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("我的姓名是"+this.getName()+"健康值为"+this.getHealth()+"亲密度为"+this.getLove());
		
	}

}
