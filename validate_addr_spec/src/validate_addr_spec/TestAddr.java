package validate_addr_spec;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddr {

	@Test
	public void test() {
		//fail("まだ実装されていません");
	}

	@Test
	public void testD1(){
		String s = "example.com";
		String s2 = "example<>.com";
		assertTrue(DomainValidator.isValidD1(s));
		assertFalse(DomainValidator.isValidD1(s2));
	}

	@Test
	public void testD2(){
		String s = "example.com";
		String s2 = ".example.com";
		assertTrue(DomainValidator.isValidD2(s));
		assertFalse(DomainValidator.isValidD2(s2));
	}

	@Test
	public void testD3(){
		String s = "example.com";
		String s2 = "example.com.";
		assertTrue(DomainValidator.isValidD3(s));
		assertFalse(DomainValidator.isValidD3(s2));
	}

	@Test
	public void testD4(){
		String s = "example.com";
		String s2 = "example..com";
		assertTrue(DomainValidator.isValidD4(s));
		assertFalse(DomainValidator.isValidD4(s2));
	}

	@Test
	public void testD5(){
		String s = "example.com";
		String s2 = "";
		assertTrue(DomainValidator.isValidD5(s));
		assertFalse(DomainValidator.isValidD5(s2));
	}


}