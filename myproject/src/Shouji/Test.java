package Shouji;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AptitudeHangst ap=new AptitudeHangst("ƻ��","iphone X");
			CommonHandset co=new CommonHandset("Ħ������", "M18");
			Master ma=new Master();
			ma.showCall(ap);
			ma.showInfo(ap);
			ma.showSendInfo(ap);
			ma.Use(ap);
			ma.showCall(co);
			ma.showInfo(co);
			ma.showSendInfo(co);
			ma.Use(co);
			System.out.println("*******************************");
			co.info();
			co.call();
			co.sendInfo();
			co.playWiring("˵ɢ��ɢ");
			ap.info();
			ap.sendInfo();
			ap.call();
			ap.networkConn();
			ap.tackPictures();
	}

}
