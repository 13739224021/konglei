package Animal1;

public class Dog extends Pet implements FlyingDiscCatchable,Eatable{

	public Dog(String name, int health, int love) throws Exception {
		super(name, health, love);
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���ڳԹ�ͷ....");
	}

	@Override
	public void catchingFlyDisc() {
		// TODO Auto-generated method stub
		System.out.println("���������......");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("����һ��С�����ҵ����ֽ�:"+this.getName()+"\t�Һ����˵����ܶ���:"+this.getLove()+"\t�ҵĽ���ֵ��:"+this.getHealth());
	}
		
}
