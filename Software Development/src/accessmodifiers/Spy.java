package accessmodifiers;

public class Spy {
	public static void main(String[] args) {
		Human h = new Human();
		//h.id = 45; // would error because it is private
	}
}
