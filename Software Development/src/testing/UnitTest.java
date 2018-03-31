package testing;

public class UnitTest {
	
	int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	// old way
	void testMax() {
		int x = max(3, 7);
		if (x != 7) {
			System.out.println("max(3, 7) gives " + x);
		}
	}

	public static void main(String[] args) {
		new MyClass().textMax();
	}


}

/* Unit Testing Advantages
 * - first line of defense
 * - modification of code becomes less risky process
 * - represents a dev's view of software specs
 * - if bug shows up despite unit tests, new unit test
 *   can be added to ensure situation is covered
 */