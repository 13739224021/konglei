package Chongwu;

public class Dog extends Pet{
				private String pin;
				public Dog() {
					
					System.out.println("����DOG����޲ι���");
				}
				public Dog(String name,String pin) {
					super(name);//���ø�����޲ι���
					this.pin=pin;
				}
				public void print() {
					super.print();
					System.out.println("����һ��"+this.pin); 
				} 
}
