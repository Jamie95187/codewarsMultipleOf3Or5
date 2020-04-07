package codewarsMultipleOf3Or5;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {
	
	private static MultipleOf3Or5 test = new MultipleOf3Or5(); 
	
	@Test
	public void sumOfMultiples_4_return3() {
		assertEquals(3, test.sumOfMultiples(4));
	}

}
