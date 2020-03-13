package data_structure.array.min_sort;

import java.util.Arrays;

public class MinSort {

	int[] arr = { 45, 3, 4, 4 };

	public int[] sort() {
		if (arr == null || arr.length <= 1)
			return null;
		int len = arr.length;
		for (int i = 0; i < len; ++i) {
			// find position of min value from arr[i] to arr[len-1]
			int nextMinPos = minpos(i, len - 1);
			// place this min value at position i
			swap(i, nextMinPos);
		}
		return arr;
	}

	// Swaps values arr[i], arr[j]
	void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Returns pos of min value from
	// positions i to j
	int minpos(int i, int j) {
		int pos = i;
		int min = arr[i];
		for (int k = i + 1; k <= j; ++k) {
			if (arr[k] < min) {
				pos = k;
				min = arr[k];
			}
		}
		return pos;
	}

	public static void main(String args[]) {
		MinSort ms = new MinSort();
		System.out.println(Arrays.toString(ms.sort()));

	}

}
