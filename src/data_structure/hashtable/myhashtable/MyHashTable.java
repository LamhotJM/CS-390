package data_structure.hashtable.myhashtable;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashTable {
	private int tablesize;
	private final static int size = 19;
	private Entry e;
	private LinkedList[] list;

	public MyHashTable(int size) {
		this.tablesize = size;
		list = new LinkedList[size];
	}

	public MyHashTable() {
		this(size);
	}

	class Entry {
		String value;
		String key;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String toString() {
			return key + "-> " + value;
		}
	}

	public void put(String key, String value) {
		int hashcode = key.hashCode();
		int index = hash(hashcode);
		Entry e = new Entry(key, value);
		if (list[index] == null) {
			list[index] = new LinkedList();

		}
		// list[index].add(e);
		if (get(key) == null) {
			list[index].add(e);
		} else
			System.out.println(key + " is already in the table. Duplicate Keys are not allowed!");
		
		return;

	}

	public String get(String key) {
		int hashcode = key.hashCode();
		int hashvalue = hash(hashcode);
		Entry e = null;
		Iterator it = list[hashvalue].iterator();
		while (it.hasNext()) {
			e = (Entry) it.next();
			if (e.key.equals(key)) {
				return e.value;
			}
		}
		return null;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				for (int j = 0; j < list[i].size(); j++) {
					sb.append(list[i].get(j));
				}
			}
		}
		return sb.toString();
	}

	public int hash(int number) {
		return number % size;

	}
	/**
	 * Print each index value in the hash table followed by 
	 * all entries stored at that index.
	 */
	public void printIndex() {
		for(int i=0;i<list.length;i++) {
			if(list[i]!=null) {
				for(int j=0;j<list[i].size();j++) {
					Entry e=(Entry) list[i].get(j);
					System.out.println(i+"  "+e);
				}
			}
		}

	}
	/**
	 * Write a method that counts the number of elements in the hash table 
	 * by traversing the hash table and the LinkedList chains.
	 * 
	 */
	public void countNumberOfElemnts() {
		int counter=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]!=null) {
				for(int j=0;j<list[i].size();j++) {
					counter++;
				}
			}
		}
System.out.println("Number of elements in the hashMap are: "+counter);
	}

	/**
	 * Write a method that returns the number of elements in the longest LinkedList chain.
	 */
	public void longestLinkedList() {
		int counter=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]!=null)
			if(list[i].size()>counter)
				counter=list[i].size();
		}
System.out.println("Longest LinkedList chain is: " +counter);
	}

	/**
	 * Write a method that returns the number of array cells that are still empty. 
	 */
	public void emptyArray() {
		int counter=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]==null)
				counter++;
		}
System.out.println("Number of empty Cells: "+counter);
	}
	
	/**
	 * Search the key i.e CSXXX in the table.  
	 * If found, return true.
	 * If not, return false; 
	 */
	public boolean search(String name) {
		for(int i=0;i<list.length;i++) {
			if(list[i]!=null)
				for(int j=0;j<list[i].size();j++) {
					Entry e=(Entry) list[i].get(j);
					if(e.key.equals(name))
						return true;
				}
		}
		
		return false;

	}

	public static void main(String[] args) {
		
		MyHashTable table = new MyHashTable();
		table.put("CS005", "SILVER");
		table.put("CS105", "YELLOW");
		table.put("CS205", "WHITE");
		table.put("CS305", "RED");
		table.put("CS405", "BLUE");
		table.put("CS505", "PINK");
		table.put("CS605", "BLACK");
		table.put("CS705", "PURPLsE");
		table.put("CS705", "PURPLEe");
		table.put("CS805", "ORANGE");
		table.put("CS905", "INDIGO");
		table.put("CS1005", "MAROON");

		System.out.println(table);

		table.printIndex();
		table.countNumberOfElemnts();
		table.longestLinkedList();
		table.emptyArray();
		
		System.out.println(table.search("CS7005"));
		System.out.println(table.search("CS705"));

		
	}
}