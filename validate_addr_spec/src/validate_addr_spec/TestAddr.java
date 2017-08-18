package validate_addr_spec;

import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Test;

public class TestAddr extends TestCase{

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
		String valid[] = {"\"example"};
		String invalid[] = {"example"};
		for (String s: valid) {
			assertTrue("quoted:"+s+" is invalid",QuotedValidator.isValidLQ1(s));
		}
		for (String s: invalid) {
			assertFalse("quoted:"+s+ "is valid, but it isn't expected..",QuotedValidator.isValidLQ1(s));
		}
	}
	@Test
	public void testLQ2() {
		String valid[] = {"example\""};
		String invalid[] = {"example"};
		for (String s: valid) {
			assertTrue("quoted:"+s+" is invalid",QuotedValidator.isValidLQ2(s));
		}
		for (String s: invalid) {
			assertFalse("quoted:"+s+ "is valid, but it isn't expected..",QuotedValidator.isValidLQ2(s));
		}
	}
	@Test
	public void testLQ3() {
		String valid[] = {"!#$%&'*+-/=?^_`{|}~(),.:;<>@[]\"\\"};
		String invalid[] = {"exampleあ"};
		for (String s: valid) {
			assertTrue("quoted:"+s+" is invalid",QuotedValidator.isValidLQ3(s));
		}
		for (String s: invalid) {
			assertFalse("quoted:"+s+ "is valid, but it isn't expected..",QuotedValidator.isValidLQ3(s));
		}
	}
	@Test
	public void testLQ4() {

	}
	@Test
	public void testLQ5() {
		String valid[] = {"\"\""};
		String invalid[] = {"\""};
		for (String s: valid) {
			assertTrue("quoted:"+s+" is invalid",QuotedValidator.isValidLQ5(s));
		}
		for (String s: invalid) {
			assertFalse("quoted:"+s+ "is valid, but it isn't expected..",QuotedValidator.isValidLQ5(s));
		}
	}

	@Test
	public void testA1(){
		String valid[] = {"abc@example.com"};
		String invalid[] = {"abc@@example.com"};
		for (String s: valid) {
			assertTrue("atto:"+s+" is invalid",Addr.isValidA1(s));
		}
		for (String s: invalid) {
			assertFalse("atto:"+s+ "is valid, but it isn't expected..",Addr.isValidA1(s));
		}
	}

	@Test
	public void testGetDomain(){
		String valid[] = {"abc@example.com"};
		Addr addr;
		for (String s: valid) {
			addr = new Addr(s);
			assertEquals("example.com", addr.getDomain());
		}
	}


	@Test
	public void testGetLocal(){
		String valid[] = {"abc@example.com"};
		Addr addr;
		for (String s: valid) {
			addr = new Addr(s);
			assertEquals("abc", addr.getLocal());
		}
	}
}