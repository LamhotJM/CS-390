package data_structure.queue_node;

import java.util.NoSuchElementException;

public class NodeQueue {

    private Node first;

    /**
     * Initializes an empty queue.
     */
    public NodeQueue() {
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
    	int size = 0;
		for (Node x = first; x != null; x = x.next){
			size++;
		}
		return size;
    }



    /**
     * Returns the item least recently added to this queue.
     *
     * @return the item least recently added to this queue
     * @throws NoSuchElementException if this queue is empty
     */
    public String peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.item;//
        
    }

    /**
     * Add the item to the queue.
     */
	public void enqueue(String item) {

		Node newNode;
		if (size() == 0) {
			newNode = new Node(item, null);
			first = newNode;
		} else {
			Node curr = first;
			Node prev = null;
			while (curr != null) {
				prev = curr;
				curr = curr.next;
			}
			newNode = new Node(item, null);
			prev.next = newNode;

		}

	}

    /**
     * Removes and returns the item on this queue that was least recently added.
     *
     * @return the item on this queue that was least recently added
     * @throws NoSuchElementException if this queue is empty
     */
    public String dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        String data = first.item;
        first = first.next;
        return data;
    }


    public String toString() {
        String s = "";

        if(first == null) return "[]";
        else{
        	Node temp = first;
        	while(temp != null){
        		s += temp.item + " ,";
        		temp = temp.next;
        	}
        }

        return s;
    }

    private class Node {
        private String item;   // the item in the node
        private Node next;   // reference to next item

        private Node(String data, Node next) {
			this.item = data;
			this.next = next;
		}
    }

    /**
     * Unit tests the {@code Queue} data type.
     */
    public static void main(String[] args) {
        NodeQueue ns = new NodeQueue();

		ns.enqueue("Bob");
		System.out.println(ns.size()+" " + ns);
		ns.enqueue("Harry");
		System.out.println(ns.size()+" " + ns);
		ns.enqueue("Steve");
		System.out.println(ns.size() +" "  + ns);
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println(ns.size()+" " + ns);
		ns.enqueue("Bill");
		System.out.println(ns.size()+" " + ns);

		System.out.println("Peek Operation : " + ns.peek());
		System.out.println(ns.size()+" " + ns);
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Empty ArrayDeque : " + ns.isEmpty());

		//System.out.println("Dequeue Operation : " + ns.dequeue());

    }
}


