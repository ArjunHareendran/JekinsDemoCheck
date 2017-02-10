import static org.junit.Assert.*;

import org.junit.Test;

import com.deloitte.demo.Calculator;

public class CalculatorTest {

	@Test
	public void sum() {
		assertEquals(11,new Calculator().sum(5,6));
	}

	@Test
	public void mul() {
		assertEquals(30,new Calculator().mul(5,6));
	}
	
	@Test
	public void sub() {
		assertEquals(4,new Calculator().sub(10,6));
	}
}
