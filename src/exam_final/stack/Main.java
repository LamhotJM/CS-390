package exam_final.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack [] stack = new MyStack[3];
		stack[0] = new ArrayStack();
		stack[1] = new NodeStack();
		stack[2] = new LinkedListStack();
		
		for(MyStack ms: stack)
		{
			ms.hello();
			ms.push("lamhot");
		 	ms.push("lasma");
		 	ms.push("last");
		 //	System.out.println(ms.size());
			System.out.println("peek ->" + ms.peek());
			ms.pop();
			//System.out.println(ms.isEmpty());
			System.out.println(ms.size());
			
		}

	}

}
