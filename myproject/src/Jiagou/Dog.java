package Jiagou;

public class Dog {
			private String name;
			private String pin;
			private int love;
			private int jiankang;
			static final String SEX_M="雄";
			static final String SEX_W="雌";
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
			public Dog() {       //无参架构  初始化值
				name="多多";
				pin="雪纳瑞";
				love=1;
				jiankang=100;
				sex=SEX_M;
			}
			public Dog(String name,String pin) {
				this.name=name;
				this.pin =pin;
			}
			public Dog(String name,String pin,String sex) {   //有参架构     
				
				this.sex=sex;
			}
			//这些架构过程 叫重载
			public  void print() {
				System.out.println("名字"+name+"品种"+pin+"亲密度"+love+"健康值"+jiankang+"性别"+sex);
			}
			static {
				System.out.println("我是静态代码块");
			}
}
	