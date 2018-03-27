package SetGet;

public abstract class People {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if (sex.equals("男")||sex.equals("女")) {
			this.sex = sex;
		}else {
			try {
				throw new Exception("只能是男和女");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public abstract void print();
}
