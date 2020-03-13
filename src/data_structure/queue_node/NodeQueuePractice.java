package data_structure.queue_node;

import java.util.NoSuchElementException;

public class NodeQueuePractice {

	private Node first;

	/**
	 * Initializes an empty queue.
	 */
	public NodeQueuePractice() {
		first = null;

	}

	/**
	 * Returns true if this queue is empty.
	 *
	 * @return {@code true} if this queue is empty; {@code false} otherwise
	 */
	public boolean isEmpty() {
		return first == null;

	}

	/**
	 * Returns the number of items in this queue.
	 *
	 * @return the number of items in this queue
	 */
	public int size() {

		Node next = first;
		int count = 0;
		for (Node i = next; i != null; i = i.next) {
			count++;

		}
		return count;

	}

	/**
	 * Returns the item least recently added to this queue.
	 *
	 * @return the item least recently added to this queue
	 * @throws NoSuchElementException if this queue is empty
	 */
	public String peek() {
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}

		return first.item;

	}

	/**
	 * Add the item to the queue.
	 */
	public void enqueue(String item) {

		Node n = new Node(item, null);

		if (first == null) {
			first = n;
		} else {
			Node curr = first;
			Node prev = null;
			while (curr != null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = n;
		}

	}

	/**
	 * Removes and returns the item on this queue that was least recently added.
	 *
	 * @return the item on this queue that was least recently added
	 * @throws NoSuchElementException if this queue is empty
	 */
	public String dequeue() {
		
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		
		String ret = first.item;
		first = first.next;
		return ret;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("");

		Node next = first;
		for (Node i = next; i != null; i = i.next) {
			sb.append(i.item + ",");
		}

		return sb.toString();

	}

	private class Node {
		private String item; // the item in the node
		private Node next; // reference to next item

		private Node(String data, Node next) {
			this.item = data;
			this.next = next;
		}
	}

	/**
	 * Unit tests the {@code Queue} data type.
	 */
	public static void main(String[] args) {
		NodeQueuePractice ns = new NodeQueuePractice();

		ns.enqueue("Bob");
		System.out.println(ns.size() + " " + ns);
		ns.enqueue("Harry");
		System.out.println(ns.size() + " " + ns);
		ns.enqueue("Steve");
		System.out.println(ns.size() + " " + ns);
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println(ns.size() + " " + ns);
		ns.enqueue("Bill");
		System.out.println(ns.size() + " " + ns);

		System.out.println("Peek Operation : " + ns.peek());
		System.out.println(ns.size() + " " + ns);
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Empty ArrayDeque : " + ns.isEmpty());

		// System.out.println("Dequeue Operation : " + ns.dequeue());

	}
}
