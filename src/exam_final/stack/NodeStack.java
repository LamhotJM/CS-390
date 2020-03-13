package exam_final.stack;


public class NodeStack implements MyStack {
	
	private Node top;

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		String peek = top.data;
		return peek;
	}

	@Override
	public void push(String obj) {
		// TODO Auto-generated method stub
		Node n = new Node(obj, top);
		top= n;
		

	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		String pop = top.data;
		top = top.next;
		System.out.println(pop);

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			return 0;
		}
		int size = 0;
		for (Node x = top; x != null; x = x.next){
			size++;
		}
		return size;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello node stack");

	}

	class Node {
		private String data;
		private Node next;

		Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

}
