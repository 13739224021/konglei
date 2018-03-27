package Jiekou;

public class Fangdao extends Door implements Suo,PaiZhao{
//防盗门类继承 门类    接口-锁
	@Override
	//下面是防盗门中 门类的功能  和接口的功能 
	public void openSuo() {
		// TODO Auto-generated method stub
		System.out.println("开锁");
	}

	@Override
	public void closeSuo() {
		// TODO Auto-generated method stub
		System.out.println("上锁");
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("开门");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("关门");
	}

	@Override
	public void pai() {
		// TODO Auto-generated method stub
		System.out.println("已录像");
	}

}
