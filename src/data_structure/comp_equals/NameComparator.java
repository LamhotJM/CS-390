package data_structure.comp_equals;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// fix here to be consistent with equals

		String name1 = o1.getName();
		String name2 = o1.getName();
		LocalDate HireDate1 = o1.getHireDay();
		LocalDate HireDate2 = o2.getHireDay();

		if (name1.compareTo(name2) != 0)
			return name1.compareTo(name2);

		return HireDate1.compareTo(HireDate2);

	}

}
