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
			System.out.println("�ҵ�������"+this.getName()+"\t�ҵ�����:"+this.getAge()+"        �ҵ��Ա���:"+this.getSex()+"\t�ҵ�Ʒ����:"+this.getPin());
		}		
}
