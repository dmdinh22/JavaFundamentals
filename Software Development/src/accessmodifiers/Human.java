package accessmodifiers;

public class Human {
	private int id;
	public String name;
	public void sayHello() {
		System.out.println("Hello there " + id); // same class, works fine
	}
}

