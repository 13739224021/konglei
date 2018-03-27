package XuLiehua;

import java.io.Serializable;

public class Pet implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String name;
		int age;
		int love;
		public Pet(String name,int age,int love) {
			this.name=name;
			this.age=age;
			this.love =love;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getLove() {
			return love;
		}
		public void setLove(int love) {
			this.love = love;
		}
		
}
