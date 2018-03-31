package tests;

public class UnitTestSeparate {
	@Test
	void testMax() {
		assertEquals(7, max(3, 7));
		assertEquals(3, max(3, -7));
	}

}
