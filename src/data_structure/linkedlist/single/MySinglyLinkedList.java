package data_structure.linkedlist.single;

public class MySinglyLinkedList {
	Node header = null; // contains no data, cannot be removed

	public MySinglyLinkedList() {
		// header should never be null
		header = new Node();
	}

	boolean search(String s) {

		Node current = header;

		while (current.next != null) {
			if (current.next.data == s) {
				return true;
			}

			current = current.next;
		}
		return false;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		Node current = header;
		while (current.next != null) {

			current = current.next;
			sb.append(current.toString() + "->");
		}
		return sb.toString();

	}

	void addFirst(String s) {

		Node current = header.next;
		Node newNode = new Node();
		newNode.data = s;
		newNode.next = current;
		header.next = newNode;

	}

	void addLast(String s) {

		if (header.next == null) {
			Node new_node = new Node();
			new_node.next = new_node;
			new_node.data = s;
		}

		Node current = header;

		while (current.next != null) {
			current = current.next;
		}

		Node new_node = new Node();
		new_node.next = null;
		new_node.data = s;
		current.next = new_node;

	}

	void insert(String s, int pos) {

		Node current = header;
		int count = 0;

		if (pos == 0) {
			addFirst(s);

		} else if (pos == size()) {
			addLast(s);

		} else {
			while (current.next != null) {
				count++;
				if (count == pos) {
					Node n = new Node();
					n.data = s;
					n.next = current.next;
					current.next = n;
					break;
				}

				current = current.next;
			}
		}

	}

	/** size = the number of non-null nodes */
	int size() {

		Node current = header;
		int count = 0;
		while (current.next != null) {
			count++;
			current = current.next;

		}
		return count;
	}

	void remove(String s) {
		if (isEmpty())
			return;
		Node prev = header;
		Node next = header.next;
		while (next != null) {
			if (next.data.equalsIgnoreCase(s)) {
				prev.next = next.next;
			}
			prev = next;
			next = next.next;
		}

	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return header.next == null;
	}

	/** Implement as inner class */
	private class Node {
		String data;
		Node next;

		@Override
		public String toString() {

			return data == null ? "null" : data;
		}

	}

	public static void main(String[] args) {

		MySinglyLinkedList listLast = new MySinglyLinkedList();
		listLast.addLast("Bob");
		listLast.addLast("Harry");
		// listLast.remove("Bob");
		// System.out.println("Remove Bob -> " + listLast);
		listLast.addLast("Steve");

		listLast.addLast("Duke");

		// System.out.println("Find Steve: -> " + listLast.search("Steve"));
		// System.out.println("Find Lamhot: -> " + listLast.search("Lamhot"));
		// listLast.printNodes();
		System.out.println(listLast.size() + ": " + listLast);

		MySinglyLinkedList listFirst = new MySinglyLinkedList();
		listFirst.addFirst("Bob");
		listFirst.addFirst("Harry");
		listFirst.addFirst("Steve");
		listFirst.addFirst("Duke");
		System.out.println(listFirst.size() + ": " + listFirst);

		listFirst.insert("John", 3);
		listFirst.insert("Lamhot", 0);
		listFirst.insert("Lamhot Last", 6);
		System.out.println(listFirst.size() + ": " + listFirst);

	}
}
