package standard_exam.ds.queue;

public class Main {

	public static void main(String[] args) throws QueueException {
		// TODO Auto-generated method stub
		MyArrayQueue q = new MyArrayQueue();
		q.peek();
		for (int i = 0; i < 15; i++) {
			q.enqueue(i);
		}
		for (int i = 0; i < 14; i++) {
			q.dequeue();
		}

		System.out.println(q.size());
	}
}
