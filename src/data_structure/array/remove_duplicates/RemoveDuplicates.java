package data_structure.array.remove_duplicates;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "A", "C", "E", "C" };
		System.out.println(Arrays.toString(removeDuplicate(arr)));

	}

	public static String[] removeDuplicate(String[] arr) {

		String[] temp = new String[arr.length];
		int count = 0;
		outer:

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) == 0) {
					continue outer;
				}
			}
			temp[count++] = arr[i];

		}
		//System.arraycopy(temp, srcPos, dest, destPos, length);
		return temp;
	}

}
