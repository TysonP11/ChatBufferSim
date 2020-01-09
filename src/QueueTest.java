import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author HP Beats
 *
 */
public class QueueTest {

	Queue queue = new Queue(5);
	@Test
	public void testQueue() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Queue#dequeue()}.
	 */
	@Test
	public void testDequeue() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Queue#enqueue(java.lang.String)}.
	 */
	@Test
	public void testEnqueue() {
		queue.enqueue("message");
		assertEquals(queue.peek(), "message");
	}

	/**
	 * Test method for {@link Queue#peek()}.
	 */
	@Test
	public void testPeek() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Queue#size()}.
	 */
	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Queue#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Queue#isFull()}.
	 */
	@Test
	public void testIsFull() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Queue#printQ()}.
	 */
	@Test
	public void testPrintQ() {
		fail("Not yet implemented");
	}

}
