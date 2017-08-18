import org.junit.Test;

import junit.framework.TestCase;

public class StackTest extends TestCase{

	@Test
	public void test() {
		//fail("まだ実装されていません");
	}

	public void testCreate(){
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
	}

}
