package Task2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class House_Construction_CostTest {

	House_Construction_Cost object=new House_Construction_Cost();
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		String s="Standard_Material";
		assertEquals(30000.0f,object.Calculation(s,25),DELTA);
	}
	@Test
	public void test1() {
		String s="Above_Standard_Material";
		assertEquals(45000.0f,object.Calculation(s,30),DELTA);
	}
	@Test
	public void test2() {
		String s="High_Standard_Material";
		assertEquals(63000.0f,object.Calculation(s,35),DELTA);
	}
	@Test
	public void test3() {
		String s="High_Standard_Material_and_Automated";
		assertEquals(100000.0f,object.Calculation(s,40),DELTA);
	}


}
