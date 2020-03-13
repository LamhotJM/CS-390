package exam_final.queue;

public interface MyQueue {

	public void enqueue(String item);

	public String dequeue();
	
	public boolean isEmpty();

	public int size();

	public String peek();

}
