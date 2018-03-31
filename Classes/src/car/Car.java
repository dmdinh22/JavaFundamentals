package car;

import java.util.Calendar;

public class Car {
	// instance vars
	String make;
	String model;
	int year;
	boolean isNew;
	double miles; // amt of miles the car has
	String owner;
	
	// sell car to newOwner
	public void sell(String newOwner) {
		owner = newOwner;
		if (isNew) {
			isNew = false;
		}
	}
	
	// age checking method
	public boolean isOld() {
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		if (thisYear - year > 10) {
			return true;
		} else {
			return false;
		}
	}
}

public static void main(String[] args) {
	Car myCar = new Car();
	myCar.make = "BMW";
	myCar.model = "M3";
	myCar.year = 2004;
	myCar.miles = 100000;
	myCar.isNew = false;
	myCar.owner = "David";
	boolean isMyCarOld = myCar.isOld();
	myCar.sell("Bart Simpson");
	System.out.println("Car owned by " + myCar.owner);
}