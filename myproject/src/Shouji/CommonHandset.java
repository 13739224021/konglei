/**
 * 
 */
package Shouji;

/**
 * @author Administrator
 *��ͨ�ֻ��࣬�̳��ֻ����࣬�ӿ�Playwiring
 */
public class CommonHandset extends HandSet implements PlayWiring {

	public CommonHandset(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playWiring(String content) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ�ֻ�������"+content);
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("��ͨ�ֻ�������");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("��ͨ�ֻ���绰");
	}

	@Override
	public void info() {
		System.out.println("��ͨ�ֻ���Ʒ��:"+this.getBrand()+"\t��ͨ�ֻ����ͺ�:"+this.getType());
		
	}
			
}
