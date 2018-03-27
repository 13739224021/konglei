package Chouxianglei;
//1父类中没必要实例化，采取将父类定义为抽象类
//public abstract class 类名(){}
//2.抽象类中不一定都是抽象方法，抽象方法一定都是在抽象类中！！！！
//3父类中定义的方法，必须由子类实现，每个子类实现的内容不同，采取抽象方法
//4抽象类不能够被实例化
public abstract class Pet {
		private String name;
		private int love;
		private int jiankang;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public Pet(String name,int love,int jiankang) {
			this.jiankang=jiankang;
			this.love=love;
			this.name=name;
		}
		//抽象方法 没有方法体
		//抽象方法必须由子类全部实现
		public abstract void print(); 
			
		
}
