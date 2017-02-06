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
	
	@Test
	public void divTest() {
		Calculator obj = new Calculator();
		assertEquals(1, obj.div(2, 2));
		assertTrue(obj.div(2, 2) != 2);		
	}
	
	@Test
	public void mulTest() {
		Calculator obj = new Calculator();
		assertEquals(4, obj.mul(2, 2));
		assertTrue(obj.mul(2, 2) != 5);		
	}
	
	@Test
	public void subTest() {
		Calculator obj = new Calculator();
		assertEquals(0, obj.sub(2, 2));
		assertTrue(obj.sub(2, 2) != 1);		
	}
}
