package calc_area;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalcArea {

	@Test
	public void test() {
		//fail("まだ実装されていません");
	}

	@Test
	public void testCalcArea1(){
		Circle circle = new Circle(10.0);
		assertEquals(circle.calculateArea(),314);

	}
	@Test
	public void testCalcArea2() {
		Circle circle = new Circle(250.0);
		assertEquals(circle.calculateArea(),196350);
	}

	@Test
	public void testCalcArea3() {
		Circle circle = new Circle(100.0);
		assertEquals(circle.calculateArea(),31416);
	}

	@Test
	public void testCalcArea4() {
		Circle circle = new Circle(1.5);
		assertEquals(circle.calculateArea(),7);
	}

	@Test
	public void testCalcArea5() {
		Circle circle = new Circle(0.0);
		assertEquals(circle.calculateArea(),196350);
	}

	@Test
	public void testCalcArea6() {
		Circle circle = new Circle(9999.0);
		assertEquals(circle.calculateArea(),314087173);
	}

}
