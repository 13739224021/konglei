import java.io.Serializable;

public class Student implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	transient String sex;

	public Student(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
