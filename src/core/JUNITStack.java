package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreatNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
		
	}

}
