package exam_final.queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue [] mq =  new MyQueue[3];
		mq[0] = new ArrayQueue();
		mq[1] = new NodeQueue();
		mq[2]= new LinkedListQueue();
		
		for(MyQueue myq:mq)
		{
			myq.enqueue("lamhot");
			myq.enqueue("lamhot2");
			myq.enqueue("lamhot3");
			System.out.println(myq.size());
			System.out.println("peek 1   -> "+ myq.getClass().getSimpleName() +" "+ myq.peek());
			myq.dequeue();
			
			System.out.println(myq.size());
			System.out.println("peek 2  ->" +myq.peek());
			
		}

	}

}
