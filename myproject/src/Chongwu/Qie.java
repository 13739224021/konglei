package Chongwu;

public class Qie extends Pet{
			private String sex;
			public Qie(String name,int love,int jiankang,String sex) {
				super(name,love,jiankang);//调用父类的无参构造
				this.sex=sex;
			}
			
			
			public void print() {
				super.print();
				System.out.println("我的性别为:"+this.sex);
			} 
}
