package standard_exam.ds.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayQueueTest {

	@Test
	void testIsEmpty() throws QueueException {
		MyArrayQueue myq = new MyArrayQueue();
		assertTrue(myq.isEmpty());
		myq.enqueue(1);
		assertFalse(myq.isEmpty());
		myq.dequeue();

		try {
			myq.peek();
		} catch (QueueException e) {

		}

	} 

	@Test
	void testSize() throws QueueException {
		MyArrayQueue myq = new MyArrayQueue();
		assertEquals(0, myq.size());
		myq.enqueue(1);
		assertEquals(1, myq.size());
	}

	@Test
	void testEnqueue() throws QueueException {
		MyArrayQueue myq = new MyArrayQueue();
		myq.enqueue(1);
		assertEquals(1, myq.size());
		assertEquals(1, myq.peek());
	}

	@Test
	void testDequeue() throws QueueException {
		MyArrayQueue myq = new MyArrayQueue();
		myq.enqueue(1);
		myq.enqueue(2);
		myq.enqueue(3);
		myq.dequeue();
		assertEquals(2, myq.size());
	}

	@Test
	void testPeek() throws QueueException {
		MyArrayQueue myq = new MyArrayQueue();
		myq.enqueue(3);
		myq.enqueue(2);
		assertEquals(3, myq.peek());
	}

	@Test
	void testIsFull() {

		MyArrayQueue myq = new MyArrayQueue();
		assertFalse(myq.isFull());
		for (int i = 0; i < 10; i++) {
			myq.enqueue(i);
		}
		assertTrue(myq.isFull());
	}

	@Test
	void testResize() {

		MyArrayQueue myq = new MyArrayQueue();
		assertFalse(myq.isFull());
		for (int i = 0; i < 10; i++) {
			myq.enqueue(i);
		}
		assertTrue(myq.isFull());
		myq.resize();
		assertFalse(myq.isFull());
	}

}
