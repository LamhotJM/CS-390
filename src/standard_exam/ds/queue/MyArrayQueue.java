package standard_exam.ds.queue;

public class MyArrayQueue {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public boolean isEmpty() {
		return rear == 0;
	}

	public boolean isFull() {
		return rear == arr.length;
	}

	public int size() throws QueueException {
		int count = 0;
		if (isEmpty()) {
			//throw new QueueException("queue is empty");
			return count;
		}
		
		for (int i = front; i < rear; i++) {
			count++;
		}
		return count;
	}

	public void enqueue(int item) {
		if (isFull()) {
			resize();
		}
		if (front == -1) {
			front++;
		}
		arr[rear] = item;
		rear++;

	}

	public void resize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;

	}

	public int dequeue() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("queue is empty");
		}
		int deq = arr[front];
		arr[front] = 0;
		front++;
		return deq;

	}

	public int peek() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("queue is empty");
		}
		int peek = arr[front];

		return peek;

	}

}
