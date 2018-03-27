package EnumTest1;

public class WeekDay {
	public Day day;

	public void weekday(Day day) {
		switch (day) {
		case d1:
System.out.println("1");
			break;
		case d2:
			System.out.println("2");
			break;
		case d3:
			System.out.println("3");
			break;
		case d4:
			System.out.println("4");
			break;
		case d5:
			System.out.println("5");
			break;
		case d6:
			System.out.println("6");
			break;
		case d7:
			System.out.println("7");
			break;

		default:
			break;
		}
	}
	public static void main(String[] args) {
		WeekDay we=new WeekDay();
	
		we.weekday(Day.d2);
	}
}
