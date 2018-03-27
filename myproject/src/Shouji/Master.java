/**
 * 
 */
package Shouji;

/**
 * @author Administrator 人类，使用手机
 */
public class Master {
	public void showSendInfo(HandSet hand) {
		hand.sendInfo();
	}//父类基本功能1

	public void showCall(HandSet hand) {
		hand.call();
	}//父类基本功能2

	public void showInfo(HandSet hand) {
		hand.info();
	}//父类基本功能3
public void Use(HandSet hand) {
	
	if (hand instanceof AptitudeHangst) {
		AptitudeHangst ap=(AptitudeHangst)hand;
		ap.tackPictures();
		ap.networkConn();
	}else if(hand instanceof CommonHandset) {
		CommonHandset co=(CommonHandset)hand;
		String content = null;
		co.playWiring(content);
	}
}
}
