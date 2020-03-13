package exam_final.queue;

import java.util.LinkedList;

public class LinkedListQueue implements MyQueue {
	
	LinkedList<String> ll = new LinkedList<String>();

	@Override
	public void enqueue(String item) {
		// TODO Auto-generated method stub
		ll.addLast(item);

	}

	@Override
	public String dequeue() {
		// TODO Auto-generated method stub
		String ret = ll.getFirst().toString();
		ll.removeFirst();
		
		return ret;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return ll.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return ll.size();
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return ll.getFirst().toString();
	}

}
