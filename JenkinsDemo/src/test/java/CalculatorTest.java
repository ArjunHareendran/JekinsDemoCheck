import static org.junit.Assert.*;

import org.junit.Test;

import com.deloitte.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void sumTest() {
		Calculator obj = new Calculator();
		assertEquals(3, obj.sum(1, 2));
		assertTrue(obj.sum(1, 2) != 4);		
	}
}
