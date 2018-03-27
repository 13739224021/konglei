package Chouxianglei;

public class Dog extends Pet {
	private String pin;
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Dog(String name,int jiankang,int love,String pin) {
		super(name,jiankang,love);
		this.pin=pin;
	}
@Override//ÖØÐ´·½·¨
public void print() {
	// TODO Auto-generated method stub
	System.out.println(this.getJiankang()+this.getName()+this.getLove()+this.getPin());
}
	
		

}
