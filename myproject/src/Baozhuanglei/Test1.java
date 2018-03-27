package Baozhuanglei;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
	Date da=new Date();
	System.out.println(da);
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
	System.out.println(sim.format(da));
	Calendar c=Calendar.getInstance();
	System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	
	
}
