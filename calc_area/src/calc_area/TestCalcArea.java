package calc_area;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCalcArea extends TestCase {

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
	@Test
	public void testReader() {
		File file;
		try{
			file=new File("test_case.txt");
			RadiusReader reader= new RadiusReader(new Scanner(file));
			ArrayList<Double> inputList=reader.getRadiusList();

			assertEquals(inputList.size(),4);
			assertEquals(inputList.get(0),10.0);
			assertEquals(inputList.get(1),250.0);
			assertEquals(inputList.get(2),100.0);
			assertEquals(inputList.get(3),1.5);
		}
		catch (Exception e) {
			e.getStackTrace();
		}


	}
}
