package Shouji;

public class AptitudeHangst extends HandSet implements Network,TheakePictures{

	public AptitudeHangst(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tackPictures() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�����");
	}

	@Override
	public void networkConn() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�����");
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�����Ϣ");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ���绰");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ���Ʒ��:"+this.getBrand()+"�����ֻ����ͺ�:"+this.getType());
	}
			
}
