package Chongwu;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog dog=new Dog();//ʵ�����������Ĭ����ִ�и�����޲������죬��ִ��������޲�������
			dog.print();
			//ʵ���������вι���ʱ��ʹ��SUPER���������ظ����ø����е��в������죬Ĭ��ֱ�ӵ��ø����е��в������죬������ø����е��޲�������
			Dog dog2=new Dog("����", "����");
			dog2.setLove(80);
			dog2.setJiankang(99);
			dog2.print();
			Qie qie=new Qie("��ü", 99, 13, "Q��");
			qie.print();
	}

}
