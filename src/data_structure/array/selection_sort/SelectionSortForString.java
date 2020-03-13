package data_structure.array.selection_sort;

import java.util.Arrays;

public class SelectionSortForString {

	public static void main(String[] args) {

		String[] adjs = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };

//		Arrays.sort(adjs);

		SelectionSortForString.sort(adjs);
		System.out.println(Arrays.toString(adjs));

	}

	public static String[] sort(String[] adjs) {

		// implement

		for (int i = 0; i < adjs.length; i++) {
			for (int j = i + 1; j < adjs.length; j++) {
				if (adjs[j].compareTo(adjs[i]) > 1) {
					String temp = adjs[i];
					adjs[i] = adjs[j];
					adjs[j] = temp;
				}

			}
		}
		return adjs;
	}
}
