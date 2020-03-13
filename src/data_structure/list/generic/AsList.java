package data_structure.list.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = Arrays.asList("A","B");
		List list2 = Arrays.asList("A","B");
		
		List[] comb = {list1,list2};
		System.out.println(Arrays.toString(comb));
		
		List<Integer> ls= new ArrayList<Integer>();
		//List<Number> nums= ls; invalid and compile error

	}

}
