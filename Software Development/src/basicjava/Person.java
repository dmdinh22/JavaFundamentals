package basicjava;

public class Person {
	String name;
	int age;
	
	// constructor
	Person (String name, int age) {
		this.name = name;
		this.age = 0;
	}
	
	// methods
	String getName() {
		return name;
	}
	
	void birthday() {
		age += 1;
		System.out.println("Happy Birthday!");
	}
	
	public static void Main(String[] args) {
		Person joe;
		joe = new Person("Joe Cool", 20);
		
		System.out.print(joe.getName());
		System.out.println(" is having a birthday!");
		joe.birthday();
	}
}

