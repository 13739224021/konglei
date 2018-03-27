/**
 * 
 */
package Animal1;

/**
 * @author Administrator
 *企鹅类
 */
public class Penguin extends Pet implements Swinmmable,Eatable {

	public Penguin(String name, int health, int love) throws Exception {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("企鹅在游泳....");
	}
		public void eat() {
	System.out.println("企鹅在吃鱼.....");
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是一个企鹅，我的名字叫:"+this.getName()+"\t我和主人的亲密度是:"+this.getLove()+"\t我的健康值是:"+this.getHealth());
	}



	
}
