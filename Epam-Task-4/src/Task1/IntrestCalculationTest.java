package Task1;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class IntrestCalculationTest {
	IntrestCalculation object=new IntrestCalculation();
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		String s="SimpleIntrest";
		assertEquals(576.0f,object.IntrestMethod(s,1200,2,24.0),DELTA);
	}
	@Test
	public void test1() {
		String p="CompoundIntrest";
		assertEquals(828.0000000000002,object.IntrestMethod(p,1200,2,30),DELTA);
	}

}
