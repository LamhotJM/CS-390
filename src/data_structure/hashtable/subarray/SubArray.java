package data_structure.hashtable.subarray;

import java.util.HashMap;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = { "A", "C", "E" };
		String[] arr2 = { "A", "B", "C", "D", "E" };
		String[] arr3 = { "A", "C", "F" };
		System.out.println("Is arr1 a subarray of 2? (expected answer : yes) " + isSubArray(arr1, arr2));
		System.out.println("Is arr1 a subarray of 2? (expected answer : no) " + isSubArray(arr3, arr2));
	}

	public static boolean isSubArray(String[] arr1, String[] arr2) {

		HashMap<String, String> hm = new HashMap<String, String>();
		for (String s : arr2) {
			hm.put(s, s);
		}

		for (String s : arr1) {
			if (!hm.containsKey(s)) {
				return false;
			}
		}

		return true;

	}

}
