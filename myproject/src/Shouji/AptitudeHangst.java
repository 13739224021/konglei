package Shouji;

public class AptitudeHangst extends HandSet implements Network,TheakePictures{

	public AptitudeHangst(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tackPictures() {
		// TODO Auto-generated method stub
		System.out.println("智能手机拍摄");
	}

	@Override
	public void networkConn() {
		// TODO Auto-generated method stub
		System.out.println("智能手机上网");
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("智能手机发信息");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("智能手机打电话");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("智能手机的品牌:"+this.getBrand()+"智能手机的型号:"+this.getType());
	}
			
}
