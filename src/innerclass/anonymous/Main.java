package innerclass.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<Employee>();
		Employee emp1 = new Employee("Bob", 5008);
		Employee emp2 = new Employee("Aob", 3008);
		Employee emp3 = new Employee("Cob", 7008);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		SalaryComparator comp = new SalaryComparator();
		Collections.sort(emps, new SalaryComparator());

		System.out.println(emps.toString());

		Collections.sort(emps, comp);
		Collections.sort(emps, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

	  //  Collections.sort(emps, (e1,e2) -> new Comparator<Employee>());

		NameComparator namecomp = new NameComparator();
		Collections.sort(emps, namecomp);

		// Arrays.sort(emps, new Comparator<Employee>());
		System.out.println(emps.toString());

	}

}
