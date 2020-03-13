package exam_final.stack;

public class ArrayStack implements MyStack{
	
	String arr[] = new String[10];
	int top =0;

	@Override
	public String peek() {
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		
		String peek = arr[top-1];
		return peek;
	}

	@Override
	public void push(String obj) {
		// TODO Auto-generated method stub
		
		arr[top]= obj;
		top++;
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		String pop = arr[top-1];
		arr[top]=null;
		top--;
		System.out.println(pop);
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==0;
	}

	@Override
	public int size() {
		if(isEmpty())
		{
			return 0;
		}
		int size = 0;
		for(int i=0; i<top;i++)
		{
			size ++;
		}
		return size;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello array stack");
		
	}

}
