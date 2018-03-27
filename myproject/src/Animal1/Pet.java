/**
 * 
 */
package Animal1;

/**
 * @author Administrator Pet抽象类
 */
public abstract class Pet {
	private String name;
	private int health;
	private int love;

	public Pet(String name, int health, int love)   {
		if (love < 0 || love > 100) {
			this.health = 30;
			System.out.println("亲密度在1-100之间，已重置");
		} else {
			this.health = health;
		}
		
			this.love = love;
			this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {

		this.health = health;

	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {

		this.love = love;

	}

	public abstract void print();

	public void eat() {
		// TODO Auto-generated method stub

	}
}
