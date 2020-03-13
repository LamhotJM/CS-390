package data_structure.comp_sort;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {

		if (emp1.getHireDate().compareTo(emp2.getHireDate()) != 0)
			return emp1.getHireDate().compareTo(emp2.getHireDate());

		if (emp1.getName().compareTo(emp2.getName()) != 0)
			return emp1.getName().compareTo(emp2.getName());

		return Double.compare(emp1.getSalary(), emp2.getSalary());
	}

}
