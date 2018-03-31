package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {
	Counter counter1;
	
	@BeforeEach
	void setUp() {
		counter1 = new Counter();
	}
	
	@Test
	void testIncrement() {
		assertTrue(counter1.increment() == 1);
		assertTrue(counter1.increment() == 2);
	}

	@Test
	void testDecrement() {
		assertTrue(counter1.decrement() == -1);
	}

}
