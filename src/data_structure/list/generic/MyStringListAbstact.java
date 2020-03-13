package data_structure.list.generic;

import java.util.AbstractList;
import java.util.Iterator;

public class MyStringListAbstact extends AbstractList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringListAbstact() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		// implement
		if (strArray.length == size) {
			resize();
		}
		strArray[size] = s;
		size++;
	}

	public String get(int i) {

		return strArray[i];
	}

	public boolean find(String s) {
		for (int i = 0; i < size; i++) {
			if (strArray[i] == s) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(String s) {
		int pos = -1;
		for (int i = 0; i < size; i++) {
			if (strArray[i] == s) {
				pos = i;
			}
		}
		// pos = 1;

		for (int i = pos; i <= size; i++) {
			strArray[i] = strArray[i + 1];
		}
		size--;
		if (pos == -1)
			return false;
		return true;
	}

	private void resize() {
		String[] new_arr = new String[strArray.length * 2];
		System.arraycopy(strArray, 0, new_arr, 0, size);
		strArray = new_arr;
		// implement
	}

	public String toString() {
		// implement
		String output = "[";

		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				output += strArray[i] + "]";

			} else {
				output += strArray[i] + ",";
			}

		}
		return output;

	}

	public String[] sort() {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (strArray[j].compareTo(strArray[i]) < 0) {
					String temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}

			}
		}
		return strArray;
	}

	public boolean binarySearch(String key) {

		// implement
		int left = 0;
		int right = size - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (strArray[mid] == key) {
				return true;
			} else if (key.compareTo(strArray[mid]) < 1) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return false;
	}

	public int size() {
		return size;
	}

	public void insert(String s, int pos) {
		for (int i = size; i >= pos; i--) {
			strArray[i + 1] = strArray[i];
		}
		strArray[pos] = s;
		size++;

	}

	public static void main(String[] args) {
		// copy test code and run it
		MyStringListAbstact l = new MyStringListAbstact();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		System.out.println(l.find("Bob"));
		System.out.println(l.find("Lamhot"));
		System.out.println(l.get(1));
		l.add("Aman");
		l.add("Bola");
		l.sort();
		System.out.println("The list of size " + l.size() + " is " + l);
		System.out.println(l.binarySearch("Bola"));
		System.out.println(l.binarySearch("Lamhot"));
		l.insert("new", 1);
		System.out.println("The list of size " + l.size() + " is " + l);

		// Iterator iterator = l.iterator();

		// using iterator

		Iterator iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
