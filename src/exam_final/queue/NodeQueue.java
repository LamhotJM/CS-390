package exam_final.queue;

public class NodeQueue implements MyQueue {
	 private Node first;

	@Override
	public void enqueue(String item) {
		// TODO Auto-generated method stub
		//addLast
		if(first == null){
			Node node = new Node(item, null);
			first = node;
		}else{

			//Find the last node in the list
			Node last = first;
			while(last.next != null) {
				last = last.next;
			}
			Node newNode = new Node(item, null);
			last.next = newNode;//update the link

		}

	}

	@Override
	public String dequeue() {
		// TODO Auto-generated method stub
		String ret = first.item;
		first = first.next;
		return ret;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return first==null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			return 0;
		}
		
		int size=0;
		
		for(Node i =first; i!=null;i=i.next)
		{
			size++;
		}
		return size;
	}

	@Override
	public String peek() {
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		// TODO Auto-generated method stub
		String peek = first.item;
		return peek;
	}
	
	 private class Node {
	        private String item;   // the item in the node
	        private Node next;   // reference to next item

	        private Node(String data, Node next) {
				this.item = data;
				this.next = next;
			}
	    }

}
