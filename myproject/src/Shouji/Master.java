/**
 * 
 */
package Shouji;

/**
 * @author Administrator ���࣬ʹ���ֻ�
 */
public class Master {
	public void showSendInfo(HandSet hand) {
		hand.sendInfo();
	}//�����������1

	public void showCall(HandSet hand) {
		hand.call();
	}//�����������2

	public void showInfo(HandSet hand) {
		hand.info();
	}//�����������3
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
