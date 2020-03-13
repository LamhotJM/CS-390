package prog26;

import java.util.Arrays;

public class prog6 {

	public static void main(String[] args) {
		// first if there is double continue to other
		String[] x = { "horse", "dog", "dog", "horse", "dog", "horse", "dog", "cat", "dog", "horse" };
		// String[] DupArr = {"horse", "dog", "horse"};
		prog6 obj = new prog6();
		System.out.println(Arrays.toString(obj.removeAllDuplicates(x)));

	}

	public String[] removeAllDuplicates(String[] dup) {
		String[] new_arr = new String[dup.length];
		int counter = 0;
		outerLoop:
		for (int i = 0; i < dup.length; i++) {
			for (int j = i + 1; j < dup.length; j++) {
				if (dup[i].equals(dup[j])) {
					continue outerLoop;
				}
			}
			new_arr[counter++] = dup[i];
		}
		String[] temp = new String[counter];
		System.arraycopy(new_arr, 0, temp, 0, counter);
		return temp;

	}

}
