package Chouxianglei;
//1������û��Ҫʵ��������ȡ�����ඨ��Ϊ������
//public abstract class ����(){}
//2.�������в�һ�����ǳ��󷽷������󷽷�һ�������ڳ������У�������
//3�����ж���ķ���������������ʵ�֣�ÿ������ʵ�ֵ����ݲ�ͬ����ȡ���󷽷�
//4�����಻�ܹ���ʵ����
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
		//���󷽷� û�з�����
		//���󷽷�����������ȫ��ʵ��
		public abstract void print(); 
			
		
}
