package polymorphism;

import java.util.Dictionary;

public class Test {
	public static void main(String args[]) {
		double d;
		int i;			// legal
		i = 3.5;		// illegal
		i = (int) 3.5;	//legal because of cast
				
		myPrint(5);
		myPrint(5.0);
	}
	
	static void myPrint(int i) {
		System.out.println("int i = " + i);
	}
	
	// overloading myPrint
	static void myPrint(double d ) { // same name, diff params
		System.out.println("double d = " + d);
	}
	
	int increment(int amount) {
		int count = 0;
		
		count += amount;
		return count;
	}
	
	int increment() {
		return increment(1);
	}
	
	void printResults() {
		String total = "";
		String average = "";
		
		System.out.println("total = " + total + ", average = " + average);
	}
	
	void printResult(String message) {
		System.out.println(message + ": ");
		printResults();
	}
	
	// DRY
	void debug() {	
		System.out.println("first = " + first );
		for (int i = first; i <= last; i++) {
			System.out.print(dictionary[i] + " ");
		}
		System.out.println();
	}
	
	void debug(String s) {
		System.out.println("At checkpoint " + s + ":");
		debug();
	}
	
	// overload constructors
	Counter() {
		count = 0;
	}
	
	Counter(int start) {
		count = start;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
		sum = x + y;
	}
	
	Point() {
		this(0, 0);
	}
}
