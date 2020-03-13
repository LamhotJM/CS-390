package data_structure.hashmap.removedup;

import java.util.Arrays;
import java.util.HashMap;

public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testData = { "horse", "dog", "cat", "horse", "dog" };
		String[] result = removeDups(testData);
		System.out.println(Arrays.toString(result));

	}

	private static String[] removeDups(String[] data) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String str : data) {
			hm.put(str, 0);
		}

		String[] str = hm.keySet().toArray(new String[0]);
		return str;
	}

}
