package List_ArrayList;

public class Cat extends Pet{
					private int health;

					public int getHealth() {
						return health;
					}

					public void setHealth(int health) {
						this.health = health;
					}
			public void print() {
				System.out.println("我的名字是"+this.getName()+"\t我的岁数:"+this.getAge()+"        我的性别是:"+this.getSex()+"\t我的健康值是:"+this.getHealth());
			}
}
