/**
 * 
 */
package Animal1;

/**
 * @author Administrator
 *�����
 */
public class Penguin extends Pet implements Swinmmable,Eatable {

	public Penguin(String name, int health, int love) throws Exception {
		super(name, health, love);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("�������Ӿ....");
	}
		public void eat() {
	System.out.println("����ڳ���.....");
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("����һ����죬�ҵ����ֽ�:"+this.getName()+"\t�Һ����˵����ܶ���:"+this.getLove()+"\t�ҵĽ���ֵ��:"+this.getHealth());
	}



	
}
