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
				System.out.println("�ҵ�������"+this.getName()+"\t�ҵ�����:"+this.getAge()+"        �ҵ��Ա���:"+this.getSex()+"\t�ҵĽ���ֵ��:"+this.getHealth());
			}
}
