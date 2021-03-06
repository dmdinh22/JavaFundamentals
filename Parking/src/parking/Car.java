package parking;



public class Car {
	// instance variables
	private String ownerName;
	private int ownerLicenseNum;
	private int registrationNum;

	private int parkingLoc;

	// constructor
	public Car(String name, int license, int registration) {
		this.ownerName = name;
		this.ownerLicenseNum = license;
		this.registrationNum = registration;
	}

	public int getParkingLoc() {
		return parkingLoc;
	}

	public void setParkingLoc(int loc) {
		parkingLoc = loc;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getOwnerLicenseNum() {
		return ownerLicenseNum;
	}
	
	public int getRegistrationNum() {
		return registrationNum;
	}
	
	// override base object's toString Method
	@Override
	public String toString() {
		// return string representation of a car.
		return ownerName + " owns the car " + registrationNum;
	}

	@Override
	public boolean equals(Object obj) {
		// casting Car object to a generic object
		Car carObj = (Car) obj;
		// returning a bool
		return this.registrationNum == carObj.registrationNum;
	}

	public static void main(String[] args) {
		Car c1 = new Car("Joe", 123, 456);
		System.out.println(c1);
		Car c2 = new Car("Ron", 123, 456);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}
}
