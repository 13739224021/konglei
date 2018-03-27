package List_ArrayList;

public class Dog extends Pet {
		private String pin;
		
		public String getPin() {
			return pin;
		}

		public void setPin(String pin) {
			this.pin = pin;
		}

		public void print() {
			System.out.println("我的名字是"+this.getName()+"\t我的岁数:"+this.getAge()+"        我的性别是:"+this.getSex()+"\t我的品种是:"+this.getPin());
		}		
}
