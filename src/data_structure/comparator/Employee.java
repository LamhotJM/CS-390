package data_structure.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employee {
	// instance fields
	private String name;
	private double salary;

	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	// instance methods
	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		// create employee array with three employees

		Employee[] emps = new Employee[3];
		Employee emp1 = new Employee("lamhot", 100);
		Employee emp2 = new Employee("wamhot", 100);
		Employee emp3 = new Employee("Aamhot", 100);
		emps[0] = emp1;
		emps[1] = emp2;
		emps[2] = emp3;
		NameComparator nc = new NameComparator();

		//System.out.println(Arrays.toString(emps));

		// emps.sort();
		Arrays.sort(emps, nc);

		// Collections.sort(emps, nc);

		for (Employee emp : emps) {
			System.out.println(emp);
		}

		// print your employee array
	}

}
