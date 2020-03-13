package standard_exam.ds.hashmap.ssn;

import java.util.ArrayList;
import java.util.Collections;
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

		List<Employee> n = new ArrayList<Employee>();
		
		for (String ssn : socSecNums) {

			if (table.containsKey(ssn) && table.get(ssn).getSalary() > 80000) {
				Employee temp = table.get(ssn);
				if (temp != null) {
					n.add(temp);
				}

			}
		}
		// IMPLEMENT
		return n;

	}

}
