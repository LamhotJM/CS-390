package data_structure.hashtable.prog114;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


class CountWord {
	// This function prints frequencies of all elements
	static void printFreq(String arr[]) {
		// Creates an empty HashMap
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		int update;
		for (String str : arr) {
			if (hmap.containsKey(str))
				update = hmap.get(str) + 1;
			else
				update = 1;
			hmap.put(str, update);
		}

		// implement
		TreeMap<String, Integer> tmap = new TreeMap<>(hmap);

		for (Map.Entry m : tmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());

	}

	// Driver method to test above method
	public static void main(String[] args) {
		String arr[] = { "andy", "mike", "andy", "andy", "andy", "mike", "emma" };
		printFreq(arr);
	}

}