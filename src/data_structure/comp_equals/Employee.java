package data_structure.comp_equals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employee {
	// instance fields
	private String name;
	private LocalDate hireDay;

	// constructor
	Employee(String aName, int aYear, int aMonth, int aDay) {
		name = aName;
		hireDay = java.time.LocalDate.of(aYear, aMonth, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public String toString() {
		return name + " and " + hireDay;
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof Employee))
			return false;
		Employee e = (Employee) ob;
		return e.name.equals(name) && e.hireDay.equals(hireDay);
	}

	public int hashCode() {
		int result = 17;
		result = result * 31 + name.hashCode();
		result = result * 31 + hireDay.hashCode();
		return result;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Joe", 1999, 10, 2);
		Employee e2 = new Employee("Joe", 2001, 9, 4);
		Employee e3 = new Employee("Joe", 1980, 9, 4);

		NameComparator comp = new NameComparator();
		System.out.println(e1.equals(e2));
		System.out.println(comp.compare(e1, e2));

		Employee[] arr = new Employee[3];
		arr[0] = e1;
		arr[1] = e2;
		arr[2] = e3;
		List<Employee> list = Arrays.asList(arr);

		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, new NameComparator());
		System.out.println(Arrays.toString(arr));

		Collections.sort(list, comp);
		
		System.out.println(Arrays.toString(arr));
		int x = 4 & 3;
		System.out.println(x);

	}

}
