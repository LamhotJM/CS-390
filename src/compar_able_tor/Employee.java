package compar_able_tor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (this.name.compareTo(o.name));
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "->"+ salary;
	}
	
	public static void main(String args[])
	{
		List <Employee> emps = new ArrayList<Employee>();
		Employee obj1 = new Employee("Lamhot",200);
		Employee obj2 = new Employee("Aamhot",300);
		Employee obj3 = new Employee("BSamhot",500);
		emps.add(obj1);
		emps.add(obj2);
		emps.add(obj3);
		Collections.sort(emps);
		System.out.println(emps);
	}

}
