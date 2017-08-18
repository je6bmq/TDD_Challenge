package validate_addr_spec;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddr {

	@Test
	public void test() {
		//fail("まだ実装されていません");
	}

	@Test
	public void testD1_LD1(){
		String valid[] = {"example.com"};
		String invalid[] = {"example<>.com"};
		for (String s: valid) {
			assertTrue("domain:"+s+" is invalid",DomainDotValidator.isValidD1(s));
		}
		for (String s: invalid) {
			assertFalse("domain:"+s+ "is valid, but it isn't expected..",DomainDotValidator.isValidD1(s));
		}

	}

	@Test
	public void testD2_LD2(){
		String valid[] = {"example.com"};
		String invalid[] = {".example.com"};

		for (String s: valid) {
			assertTrue("domain:"+s+" is invalid",DomainDotValidator.isValidD2(s));
		}
		for (String s: invalid) {
			assertFalse("domain:"+s+ "is valid, but it isn't expected..",DomainDotValidator.isValidD2(s));
		}

	}

	@Test
	public void testD3_LD3(){
		String valid[] = {"example.com"};
		String invalid[] = {"example.com."};

		for (String s: valid) {
			assertTrue("domain:"+s+" is invalid",DomainDotValidator.isValidD3(s));
		}
		for (String s: invalid) {
			assertFalse("domain:"+s+ "is valid, but it isn't expected..",DomainDotValidator.isValidD3(s));
		}

	}

	@Test
	public void testD4_LD4(){
		String valid[] = {"example.com"};
		String invalid[] = {"example..com"};
		for (String s: valid) {
			assertTrue("domain:"+s+" is invalid",DomainDotValidator.isValidD4(s));
		}
		for (String s: invalid) {
			assertFalse("domain:"+s+ "is valid, but it isn't expected..",DomainDotValidator.isValidD4(s));
		}

	}

	@Test
	public void testD5_LD5(){
		String valid[] = {"example.com"};
		String invalid[] = {""};
		for (String s: valid) {
			assertTrue("domain:"+s+" is invalid",DomainDotValidator.isValidD5(s));
		}
		for (String s: invalid) {
			assertFalse("domain:"+s+ "is valid, but it isn't expected..",DomainDotValidator.isValidD5(s));
		}

	}

	@Test
	public void testLQ1() {

	}
	@Test
	public void testLQ2() {

	}
	@Test
	public void testLQ3() {

	}
	@Test
	public void testLQ4() {

	}
	@Test
	public void testLQ5() {

	}
}