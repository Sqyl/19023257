package ChangWang;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		int a = 1;
		int b = 10;
		assertEquals(a + b,Calc.add(a,b));
		
	}
}
