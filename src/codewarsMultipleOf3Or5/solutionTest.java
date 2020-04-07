package codewarsMultipleOf3Or5;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {
	
	@Test
	public void sumOfMultiples_4_return3() {
		assertEquals(3, MultipleOf3Or5.sumOfMultiples(4));
	}

	@Test
	public void sumOfMultiples_6_return3() {
		assertEquals(8, MultipleOf3Or5.sumOfMultiples(6));
	}
	
	@Test
	public void sumOfMultiples_7_return3() {
		assertEquals(14, MultipleOf3Or5.sumOfMultiples(7));
	}
	
}
