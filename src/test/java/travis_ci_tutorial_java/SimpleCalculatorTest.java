package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testSubtract(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5,3),2);
	}

	@Test
	public void multiply(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(3,4),12);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivideZero(){
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(5,0);
	}
}
