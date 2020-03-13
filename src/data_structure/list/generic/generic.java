package data_structure.list.generic;

import java.util.ArrayList;
import java.util.List;

public class generic {
	//USAGE
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>(); 
		list.add("Bob");
		list.add("Sally");
		String name = list.get(0); //no downcast required
		//iterate using for each construct – no downcasting needed for(String s : list) {
		  //do something with s
		
		//clumsy runtime exceptions are now replaced by compiler errors List<Integer> list = new ArrayList<Integer>(); list.add(new Integer(1));
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(1));
		list2.add(new Integer(3));
		//list2.add("5");
		
		//compiler error
		//List<String>[] arrayOfLists = new ArrayList<String>[10]; compile error
		//Workaround: can use an ArrayList instead of an Array: 
		ArrayList<List<String>> listOfLists =  new ArrayList<List<String>>(10);
		
		
		

	}
}
