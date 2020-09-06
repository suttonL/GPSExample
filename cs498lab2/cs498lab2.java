package cs498lab2;

import static org.junit.Assert.*;

import org.junit.*;

public class MyUnitTest {
	@Test
	public void basicTest() {
		assertTrue("true is true", true);
	}
	@Test(expected = NumberFormatException.class)
	public void exceptionTest() {
		Integer.parseInt("error");
		fail("expected a NumberFormatException");
	}
	
	@Test
	public void equalTest(){
		assertEquals(2+5, 7);
	}
	
	@Test(expected = NumberFormatException.class)
	public void exceptionTest1() {
		Integer.parseInt("2");
		fail("excpected a NumberFormatException");
	}
}


