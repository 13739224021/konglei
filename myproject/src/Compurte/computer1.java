package Compurte;

import java.util.Scanner;

public class computer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String brand = null;
		System.out.println(" ‰»ÎCPU–Õ∫≈:");
		brand=input.next();
				CPU cpu=new cpu1();
				EMS ems=new ems1();
				HardDisk hd=new harddisk1();
				Computer p=new Computer(cpu, ems, hd);
			     p.show();
				cpu.getCPUBrand(brand);
				
	}

}
