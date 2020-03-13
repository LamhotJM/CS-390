package exam_final.stack;

import java.util.LinkedList;

public class LinkedListStack implements MyStack{
	
	LinkedList<String> ll;
	
	public LinkedListStack() {
		ll = new LinkedList();
	}

	@Override
	public String peek() {
		
	//	return ll.getLast();
		return ll.getFirst();
	}

	@Override
	public void push(String obj) {

		 ll.addFirst(obj);
	   //  ll.addLast(obj);
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
		//System.out.println(ll.getLast());
		System.out.println(ll.getFirst());
		//ll.removeLast();
		ll.removeFirst();
		
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
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello linked list stack ");
		
	}

}
