package data_structure.array.linear_search;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int[] nums = { -4, 1, 7, 16, 35, 36, 49 };

		System.out.println(Arrays.toString(nums));
		System.out.println("Is 16 in the Array?: " + LinearSearch.linearSearch(nums, 16));
		System.out.println("Is 7 in the Array?: " + LinearSearch.linearSearch(nums, 7));
		System.out.println("Is 40 in the Array?: " + LinearSearch.linearSearch(nums, 40));

	}

	private static boolean linearSearch(int[] nums, int key) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return true;
			}
		}

		// implement

		return false;
	}

}
