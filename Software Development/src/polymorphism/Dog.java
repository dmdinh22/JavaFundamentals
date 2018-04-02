package polymorphism;

public class Dog extends Animal {
	// overrides base class's method (Animal's print method)
	void print() {
		System.out.println("Subclass Dog");
	}
}

// how to override a method
/*
 *create a method in a subclass w/ same signature as a method in superclass
 *		- create method in subclass having same name and number and params
 *		- param names don't matter, just types
 *restrictions:
 * 	- return type must be the same
 * 	- overriding method cannot be more private than the method it overrides
 */
 