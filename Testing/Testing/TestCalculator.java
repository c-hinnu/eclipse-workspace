import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculator {
	
	@Test
	public void test() {
		Calculator t=new Calculator();
		assertEquals(25,t.square(5));
}
}