package data_structure.hashtable.prog11;

public class MyTable {
	private Entry[] entries = new Entry[26];

	// private static static final int INITIAL_SIZE=20;
	//private int tableSize;

	// private LinkedList[] table;

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		int index = c-97;
		return entries[index].value;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		int temp = c;// star from zero a ->97 we only have 26 
		System.out.println(temp);
		int index = (int) c - 97;
		//	int index = (int) c - 'a';
		Entry object = new Entry(s, c);
		entries[index] = object;

	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		String str = "";
		System.out.println( entries.length);
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] != null) {
				str += entries[i].toString() + "\n";
			}
		}

		return str;
	}

	private class Entry {
		private char key;
		private String value;

		Entry(String str, char ch) {
			// implement
			this.key = ch;
			this.value = str;
		}

		public Entry(char c, String s) {
			// TODO Auto-generated constructor stub
		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement

			return key + " ->" + value;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('a', "Andrew II");
		t.add('b', "Billy");
		t.add('w', "Willie");

		System.out.println(t);

		String s = t.get('a');
		System.out.println(s);

	}

}