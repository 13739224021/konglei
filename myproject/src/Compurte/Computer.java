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
		System.out.println("计算机的信息如下");
	
		System.out.println("主频为"+cpu.getFrequency());
		System.out.println("硬盘容量为:"+harddisk.getCapacity());
		System.out.println("内存容量为:"+ems.getSize());
	}
	
}

