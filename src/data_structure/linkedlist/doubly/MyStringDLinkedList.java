package data_structure.linkedlist.doubly;

public class MyStringDLinkedList {

	Node header;

	MyStringDLinkedList() {
		header = new Node(null, null, null);
	}

	public void addLast(String item) {

		if (header.next == null) {
			Node n = new Node(header, item, null);

			header.next = n;
		} else {
			Node last;
			Node curr = header.next;

			while (true) {
				if (curr.next == null) {
					last = curr;
					break;
				}
				curr = curr.next;
			}
			Node n = new Node(last, item, null);
			last.next = n;
		}

	}

	public void addFirst(String item) {
		if (header.next == null) {
			Node n = new Node(header, item, null);
			header.next = n;
		} else {
			Node curr = header.next;
			Node n = new Node(header, item, curr.next);
			header.next = n;
			n.next = curr;
		}

	}

	public void add(int index, String element) {
		if (index == 0) {
			addFirst(element);
		} else if (index == size()) {
			addLast(element);

		} else {
			Node next = header;
			int count = 0;
			while (next.next != null) {
				count++;
				if (count == index) {
					Node n = new Node(next.previous, element, next.next);
					next.next = n;
					n.previous = next;

				}
				next = next.next;
			}
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node curr = header.next;
		while (curr != null) {
			sb.append(curr.value + "-> ");
			curr = curr.next;
		}
		return sb.toString();
	}

	public int size() {
		int count = 0;
		Node current = header;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		return count;

	}

	public boolean isEmpty() {
		return header.next == null;
	}

	public String findFirst() {
		return header.next.value;
	}

	public String findLast() {
		Node last;
		Node curr = header.next;

		while (true) {
			if (curr.next == null) {
				last = curr;
				break;
			}
			curr = curr.next;
		}
		return last.value;

	}

	public boolean find(String s) {

		Node next = header;
		while (next.next != null) {
			if (next.next.value.equalsIgnoreCase(s)) {
				return true;
			}

			next = next.next;
		}
		return false;

	}

	public int findIndex(String s)// the index of the String s, if found
	{
		Node next = header;
		if (isEmpty()) {
			return -1;
		}

		int index = 0;
		while (next.next != null) {
			index++;
			if (next.next.value.equalsIgnoreCase(s))
				return index;

			next = next.next;
		}

		return -1;

	}

	public String removeFirst() {
		Node first = header.next;
		if (isEmpty() || first == null) {
			return null;
		} else {
			header.next = first.next;
			first.next.previous = header;
		}

		return first.value;

	}

	public String removeLast() {
		if (isEmpty()) {
			return null;
		}

		Node next = header.next;
		while (true) {
			if (next.next == null) {
				break;
			}
			next = next.next;
		}
		String val = next.value;

		if (next.previous != null)
			next.previous.next = next.next;

		if (next.next != null) {
			next.next.previous = next.previous;
		}

		return val;
	}

	public boolean remove(int index) {
		Node curr = header;
		int count = 0;
		if (index == 0) {
			removeFirst();
			return true;
		} else if (index == size() - 1) {
			removeLast();
			return true;
		} else {
			while (curr.next != null) {
				count++;
				if (count == index) {
					Node prev = curr.previous;
					Node next = curr.next;
					prev.next = next;
					next.previous = prev;
					return true;
				}
				curr = curr.next;
			}

			return false;
		}
	}

	public String findMin() {
		Node next = header.next;
		String min = next.value;

		for (Node i = next.next; i != null; i = i.next) {
			System.out.println(next.value);
			if (min.compareTo(i.value) > 0) {
				min = i.value;
			}
			next = next.next;

		}
		return min;
	}

	public String findMax() {
		Node next = header.next;
		String max = next.value;

		for (Node i = next.next; i != null; i = i.next) {
			System.out.println(next.value);
			if (max.compareTo(i.value) < 0) {
				max = i.value;
			}
			next = next.next;

		}
		return max;
	}

	public Node findMinNode(Node next) {
		String min = next.value;
		Node minNode = next;
		for (Node i = next.next; i != null; i = i.next) {
			if (min.compareTo(i.value) > 0) {
				min = i.value;
				minNode = i;
			}
			next = next.next;
		}
		return minNode;
	}

	public void swap(Node n1, Node n2) {
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;

	}

	public void sort() {
		for (Node i = header.next; i != null; i = i.next) {
			Node temp = findMinNode(i);
			swap(i, temp);
		}
	}

	public String removeMax() {
		Node curr = header.next;
		String maxVal = curr.value;
		for (Node i = curr.next; i != null; i = i.next) {
			if (maxVal.compareTo(i.value) < 0) {
				curr = i;
				maxVal = i.value;

			}
		}
		Node prev = curr.previous;
		Node next = curr.next;
		prev.next = next;
		if (next != null) {
			next.previous = prev;
		}
		return maxVal;
	}

	public void removeExtra() {
		Node curr = header;
		for (Node i = curr.next; i != null; i = i.next) {
			if (curr.value == i.value) {
				Node prev = i.previous;
				Node next = i.next;
				prev.next = next;
				next.previous = prev;
			}

			curr = i;
		}
	}

	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		MyStringDLinkedList list = new MyStringDLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		System.out.println(list.size() + ": " + list);

		MyStringDLinkedList listfirst = new MyStringDLinkedList();
		listfirst.addFirst("Bob");
		listfirst.addFirst("Harry");
		listfirst.addFirst("Steve");
		listfirst.add(2, "Second");
		System.out.println(listfirst.size() + ": " + listfirst);
		System.out.println("find Bob ->" + listfirst.find("Bob"));
		System.out.println("Find No -> " + listfirst.find("No"));
		System.out.println("find index Bob ->" + listfirst.findIndex("Bob"));
		System.out.println("Find index No -> " + listfirst.findIndex("No"));
		System.out.println("Find First ->" + listfirst.findFirst());
		System.out.println("Find Last -> " + listfirst.findLast());
		System.out.println("Remove First -> " + listfirst.removeFirst());

		MyStringDLinkedList list2 = new MyStringDLinkedList();

		String[] arr = { "s", "a", "big", "big", "small", "tall", "tall", "short", "short", "round", "square",
				"enormous", "tiny", "gargantuan", "lilliputian", "numberless", "none", "vast" };

		for (String val : arr) {
			list2.addLast(val);
		}

		System.out.println(list2.size() + ": " + list2);

		// System.out.println("Remove Last -> " + list2.removeLast());

		// list2.remove(2);
		// System.out.println(list2.size() + ": " + list2);

		// System.out.println("Min ->" + list2.findMin());
		// System.out.println("Max ->" + list2.findMax());
		// list2.sort();
		// System.out.println(list2.findMinNode().value);
		list2.removeMax();
		System.out.println(list2.size() + ": " + list2);

	}
}
