package Chongwu;

public class Qie extends Pet{
			private String sex;
			public Qie(String name,int love,int jiankang,String sex) {
				super(name,love,jiankang);//���ø�����޲ι���
				this.sex=sex;
			}
			
			
			public void print() {
				super.print();
				System.out.println("�ҵ��Ա�Ϊ:"+this.sex);
			} 
}
