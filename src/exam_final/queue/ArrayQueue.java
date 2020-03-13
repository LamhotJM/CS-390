package exam_final.queue;

public class ArrayQueue implements MyQueue {
	
	String [] arr = new String[10];
	private int front =-1;
	private int rear =0;
	@Override
	public void enqueue(String item) {
		// TODO Auto-generated method stub
		if(front==-1)
		{
			front++;
		}
		arr[rear]= item;
		rear++;
		
	}

	@Override
	public String dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		String deq= arr[front];
		arr[front]=null;
		front++;
		return deq;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(rear==0 || rear ==front)
		{return true;
		}
		
		return false;
		
	}

	@Override
	public int size() {
		if(isEmpty())
		{
			return 0;
		}
		int count =0;
		for(int i=front ; i<rear;i++ )
		{
			count ++;
		}
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		String peek= arr[front];
		return peek;
	}

}
