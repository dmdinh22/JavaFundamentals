package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTestSeparate {
	@Test
	void testMax() {
		assertEquals(7, max(3, 7));
		assertEquals(3, max(3, -7));
	}

}
