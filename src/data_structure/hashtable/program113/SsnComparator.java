package data_structure.hashtable.program113;

import java.util.Comparator;

public class SsnComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSsn().compareTo(o2.getSsn());
	}

}
