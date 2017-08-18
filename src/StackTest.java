import org.junit.Test;

import junit.framework.TestCase;

public class StackTest extends TestCase{

	@Test
	public void test() {
		//fail("まだ実装されていません");
	}
	@Test
	public void testCreate(){
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
	}
	@Test
	public void testSize(){
		Stack stack = new Stack();
		assertEquals(stack.size(),0);
	}
	@Test
	public void testPush(){
		Stack stack= new Stack();
		stack.push(1);
		assertEquals(stack.size(),1);
	}
}
