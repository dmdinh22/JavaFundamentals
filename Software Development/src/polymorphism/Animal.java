package polymorphism;

public class Animal {
	public static void main(String args[]) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		animal.print();
		dog.print();
	}
	void print() {
		System.out.println("Superclass Animal");
	}
}


