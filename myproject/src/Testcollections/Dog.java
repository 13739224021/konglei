package Testcollections;

public class Dog extends Pet {

	public Dog(String name, int health, int love) {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("�ҵ�������"+this.getName()+"����ֵΪ"+this.getHealth()+"���ܶ�Ϊ"+this.getLove());
		
	}

}
