package data_structure.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("lam");
		list.add("lam");
		list.add("ayu");
		System.out.println(removeDups(list));

	}

	public static List<String> removeDups(List<String> str) {
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str.size(); i++) {
			for (int j = i + 1; j < str.size(); j++) {
				if (str.get(i) == str.get(j)) {
					continue;
				} else {
					list.add(str.get(i));
				}
			}

		}

		return list;

	}

}
