package accessmodifiers;
// best practice for instace vars - private
// use getters and setters to access instance vars
public class Student {
	private int age;
	private String name;
	
	public void setAge(int age) {
		if (verifyAge(age)) {
			this.age = age;
		}
	}
	
	private boolean verifyAge(int age) {
		return age >= 1;
	}
	
	public String getName() {
		return name; // getter
	}
	
	public void setName(String name) {
		this.name = name; // setter
	}
}
