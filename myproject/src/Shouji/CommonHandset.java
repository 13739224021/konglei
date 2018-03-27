/**
 * 
 */
package Shouji;

/**
 * @author Administrator
 *普通手机类，继承手机父类，接口Playwiring
 */
public class CommonHandset extends HandSet implements PlayWiring {

	public CommonHandset(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playWiring(String content) {
		// TODO Auto-generated method stub
		System.out.println("普通手机发音乐"+content);
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("普通手机发短信");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("普通手机打电话");
	}

	@Override
	public void info() {
		System.out.println("普通手机的品牌:"+this.getBrand()+"\t普通手机的型号:"+this.getType());
		
	}
			
}
