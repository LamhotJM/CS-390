package data_structure.lab3.array.smallest;

import java.util.Arrays;

/**
 *
 * Add the element 9 at the position 1
 *
 */
public class AddElement {

	public static void main(String[] args) {

		int[] nums = new int[8];

		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 3;

		System.out.println(Arrays.toString(nums));

		int pos = 1;
		int val = 9;
		int lastIndex = 4;

		for (int i =lastIndex; i<=pos; i--) {
			nums[i] =nums[i+1];
		}
		nums[pos] = val;
		lastIndex++;

		System.out.println(Arrays.toString(nums));
		// int [] temp = new int [lastIndex+1];

		// implement
		// added element 9 at pos 1: [4, 9, 5, 7, 1, 3, 0, 0]

	}

}
