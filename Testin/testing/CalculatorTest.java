package testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator c = new Calculator();
	
	
	@Test
	public void testAdd() {
		assertEquals(5,c.add(2, 3));
	}

}
