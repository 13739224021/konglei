package Chongwu;

public class Dog extends Pet{
				private String pin;
				public Dog() {
					
					System.out.println("我是DOG类的无参构造");
				}
				public Dog(String name,String pin) {
					super(name);//调用父类的无参构造
					this.pin=pin;
				}
				public void print() {
					super.print();
					System.out.println("我是一个"+this.pin); 
				} 
}
