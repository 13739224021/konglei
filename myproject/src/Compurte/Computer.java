package Compurte;

public class Computer {
	CPU cpu;
	EMS ems;
	HardDisk harddisk;
	public Computer(CPU cpu,EMS ems,HardDisk harddisk) {
		this.cpu=cpu;
		this.ems=ems;
		this.harddisk=harddisk;
	}
	public void show() {
		System.out.println("���������Ϣ����");
	
		System.out.println("��ƵΪ"+cpu.getFrequency());
		System.out.println("Ӳ������Ϊ:"+harddisk.getCapacity());
		System.out.println("�ڴ�����Ϊ:"+ems.getSize());
	}
	
}

