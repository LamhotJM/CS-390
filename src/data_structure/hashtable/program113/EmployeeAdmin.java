package data_structure.hashtable.program113;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		List<Employee> newList = new ArrayList<Employee>();
		for (String ss : socSecNums) {
			if (table.containsKey(ss) && table.get(ss).getSalary() > 80000) {
				Employee temp = table.get(ss);
				if (temp != null) {
					newList.add(table.get(ss));
				}

			}
		}
		// IMPLEMENT

		return newList;
	}

	/**
	 * Returns a list of Employees whose social security number is not in the input
	 * list socSecNums
	 */
	public static List<Employee> findSsnIsNotInList(HashMap<String, Employee> table, List<String> socSecNums) {
		// IMPLEMENT

		List<Employee> newList = new ArrayList<Employee>();
		for (String em : table.keySet()) {
			if (!socSecNums.contains(em)) {
				newList.add(table.get(em));
			}
		}
		return newList;
	}
}
