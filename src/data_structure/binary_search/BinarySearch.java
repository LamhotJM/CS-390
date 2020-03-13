package data_structure.binary_search;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { -4, 1, 7, 16, 35, 36, 49 };

		System.out.println(Arrays.toString(nums));
		System.out.println("Is 16 in the Array?: " + BinarySearch.binarySearch(nums, 16));
		System.out.println("Is 7 in the Array?: " + BinarySearch.binarySearch(nums, 7));
		System.out.println("Is 40 in the Array?: " + BinarySearch.binarySearch(nums, 40));

//		Collections.binarySearch();
//		Arrays.binarySearch(a, key);

	}

	public static boolean binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				return true;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return false;
	}
}
