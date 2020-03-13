package standard_exam.ds.doubly.linkedlist;

public class MinDoublyLinkedList {

	Node header;

	public MinDoublyLinkedList() {
		header = new Node();
	}

	public void add(String item) {
		if (header.next == null) {
			Node n = new Node();
			n.value = item;
			n.next = null;
			n.previous = header;
			header.next = n;
		} else if (item.compareTo(header.next.value) < 1) {
			Node temp = header.next;
			Node n = new Node();
			n.next = temp;
			n.previous = header;
			n.value = item;
			header.next = n;

		} else {
			Node n = new Node();
			Node temp = header.next.next;
			n.next = temp;
			n.value = item;
			n.previous = header.next;
			header.next.next = n;

		}

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

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

		public String toString() {
			return value == null ? "null" : value;
		}

		public Node(String value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}

		public Node() {

		}
	}

	public static void main(String[] args) {
		MinDoublyLinkedList list = new MinDoublyLinkedList();
		list.add("bob");
		System.out.println(list);
		list.add("harry");
		System.out.println(list);
		list.add("steve");
		System.out.println(list);
		list.add("anne");
		System.out.println(list);

	}
}
