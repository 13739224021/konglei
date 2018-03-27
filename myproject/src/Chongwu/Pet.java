package Chongwu;

public class Pet {
		private String name;
		private int jiankang;
		private int love;
		public Pet() {
			System.out.println("我是父类的无参构造");
		}
		public Pet(String name) {
			this.name=name;
		}
		public Pet(String name,int jiankang,int love ) {
			this.jiankang=jiankang;
			this.love =love;
			this.name=name;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getJiankang() {
			return jiankang;
		}

		public void setJiankang(int jiankang) {
			this.jiankang = jiankang;
		}

		public int getLove() {
			return love;
		}

		public void setLove(int love) {
			this.love = love;
		}

		public void print() {
			System.out.println("姓名："+name+"健康值"+jiankang+"亲密度:"+love);
		}
}
