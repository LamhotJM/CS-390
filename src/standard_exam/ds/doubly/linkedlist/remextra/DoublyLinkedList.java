package standard_exam.ds.doubly.linkedlist.remextra;

public class DoublyLinkedList {

	Node header;

	public DoublyLinkedList() {
		header = new Node(null, null, null);
	}

	// add to the end of the linkedlist
	public void add(String item) {

		Node previous = header;
		Node current = header.next;
		while (current != null) {
			previous = current;
			current = current.next;
		}
		Node newNode = new Node(null, previous, item);
		previous.next = newNode;

	}

	public void removeExtra() {

		Node curr = header;
		for (Node i = curr.next; i != null; i = i.next) {
			if (curr.value == i.value) {
				Node prev = i.previous;
				Node next = i.next;
				prev.next = next;
				if (next != null)
					next.previous = prev;
			}

			curr = i;
		}

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		if (sb.toString().length() >= 2)
			return sb.toString().substring(1);
		else
			return null;

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob");
		list.add("Tom");
		list.add("Steve");
		System.out.println(list);

		test1();
		test2();
		test3();

	}

	// expected output: Bob Tom Steve Harold
	public static void test1() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob");
		list.add("Bob");
		list.add("Tom");
		list.add("Steve");
		list.add("Steve");
		list.add("Harold");
		list.removeExtra();
		System.out.println(list);
	}

	// expected output: Bob Tom Steve Harold Steve Harold
	public static void test2() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob");
		list.add("Tom");
		list.add("Steve");
		list.add("Harold");
		list.add("Steve");
		list.add("Harold");
		list.removeExtra();
		System.out.println(list);
	}

	// expected output: Bob Tom Steve Harold Steve
	public static void test3() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob");
		list.add("Tom");
		list.add("Steve");
		list.add("Harold");
		list.add("Steve");
		list.add("Steve");
		list.removeExtra();
		System.out.println(list);
	}

}
