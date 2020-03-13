package data_structure.lab3.array.smallest;

import java.util.Arrays;

/**
 *
 * Delete the element at the position 1
 *
 */
public class DeleteElement {

	public static void main(String[] args) {

		int[] nums = new int[8];

		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 3;

		System.out.println(Arrays.toString(nums));

		int pos = 1;
		int lastIndex = 4;

		for (int i = pos; i <=lastIndex; i++) {
			nums[i] = nums[i + 1];
		}
		lastIndex--;
		// [4, 7, 1, 3, 0, 0, 0, 0] is the expected output.
		System.out.println(Arrays.toString(nums));

	}

}
