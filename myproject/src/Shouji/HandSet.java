package Shouji;
//手机类，父类，抽象类
public abstract class HandSet {
	private String brand;
	private String type;
	
	//有参构造
	public HandSet(String brand,String type) {
	this.brand=brand;
	this.type=type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public abstract void sendInfo();
	public abstract void call();
	public abstract void info();
}
