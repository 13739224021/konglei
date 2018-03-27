package Compurte;

public class cpu1 implements CPU {



	@Override
	public String getFrequency() {
		String i="3.8GH";
		return i;
	}

	@Override
	public void getCPUBrand(String brand) {
		System.out.print("CPUµÄÐÍºÅ:"+brand);
		
	}

}
