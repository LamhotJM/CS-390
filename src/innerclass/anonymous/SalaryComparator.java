package innerclass.anonymous;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
	
		// TODO Auto-generated method stub
		//return Double.compare(e1.getSalary(), e2.getSalary());
		return Double.compare(e1.getSalary(), e2.getSalary());
	}

}
