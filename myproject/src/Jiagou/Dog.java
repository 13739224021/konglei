package Jiagou;

public class Dog {
			private String name;
			private String pin;
			private int love;
			private int jiankang;
			static final String SEX_M="��";
			static final String SEX_W="��";
			private String sex;
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getPin() {
				return pin;
			}
			public void setPin(String pin) {
				this.pin = pin;
			}
			public int getLove() {
				return love;
			}
			public void setLove(int love) {
				this.love = love;
			}
			public int getJiankang() {
				return jiankang;
			}
			public void setJiankang(int jiankang) {
				this.jiankang = jiankang;
			}
			public String getSex() {
				return sex;
			}
			public void setSex(String sex) {
				this.sex = sex;
			}
			public static String getSexM() {
				return SEX_M;
			}
			public static String getSexW() {
				return SEX_W;
			}
			public Dog() {       //�޲μܹ�  ��ʼ��ֵ
				name="���";
				pin="ѩ����";
				love=1;
				jiankang=100;
				sex=SEX_M;
			}
			public Dog(String name,String pin) {
				this.name=name;
				this.pin =pin;
			}
			public Dog(String name,String pin,String sex) {   //�вμܹ�     
				
				this.sex=sex;
			}
			//��Щ�ܹ����� ������
			public  void print() {
				System.out.println("����"+name+"Ʒ��"+pin+"���ܶ�"+love+"����ֵ"+jiankang+"�Ա�"+sex);
			}
			static {
				System.out.println("���Ǿ�̬�����");
			}
}
	