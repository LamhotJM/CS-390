package data_structure.list.generic;

import java.util.ArrayList;
import java.util.List;

public class nonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list2 = new ArrayList();
		list2.add("mike");
		Integer i = (Integer) list2.get(0);
		
		

		List<String> list3 = new ArrayList<String>();
		list3.add("mike");
		//Integer i3 = (Integer) list3.get(0); -> would be compile error!!

	}

}
