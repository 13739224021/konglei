package Animal1;

public class Dog extends Pet implements FlyingDiscCatchable,Eatable{

	public Dog(String name, int health, int love) throws Exception {
		super(name, health, love);
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗在吃骨头....");
	}

	@Override
	public void catchingFlyDisc() {
		// TODO Auto-generated method stub
		System.out.println("狗在玩飞盘......");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是一个小狗，我的名字叫:"+this.getName()+"\t我和主人的亲密度是:"+this.getLove()+"\t我的健康值是:"+this.getHealth());
	}
		
}
