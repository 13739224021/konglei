package Chongwu;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog dog=new Dog();//实例化子类对象，默认先执行父类的无参数构造，再执行子类的无参数构造
			dog.print();
			//实例化子类有参构造时，使用SUPER（参数）重复调用父类中的有参数构造，默认直接调用父类中的有参数构造，不会调用父类中的无参数构造
			Dog dog2=new Dog("花花", "土狗");
			dog2.setLove(80);
			dog2.setJiankang(99);
			dog2.print();
			Qie qie=new Qie("美眉", 99, 13, "Q仔");
			qie.print();
	}

}
