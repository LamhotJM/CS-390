package data_structure.lab3.array.smallest;

import java.util.Arrays;

/**
 *
 * swap the smallest element to 0th position in the array
 *
 */
public class SmallestElement {

	public static void main(String[] args) {

		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
		int minPos = 0;
		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
				minPos = i;
			}
		}

		int temp = nums[0];
		nums[0] = min;
		nums[minPos] = temp;
		System.out.println(Arrays.toString(nums));

		// implement

//		[-4, 35, 7, 1, 16, 36, 49] is the expected output.
	}

}
