package compar_able_tor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person
{
    private String name;
	private double salary;

	public Person (String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "->"+ salary;
	}
	
	public static void main(String args[])
	{
		List <Person> person = new ArrayList<Person>();
		Person obj1 = new Person("Lamhot",600);
		Person obj2 = new Person("Aamhot",300);
		Person obj3 = new Person("BSamhot",500);
		person.add(obj1);
		person.add(obj2);
		person.add(obj3);
		System.out.println(person);
		NameComparator namecomp= new NameComparator();
		//Collections.sort(person);
		Collections.sort(person,namecomp);
		Collections.sort(person, (p1,p2) -> p1.getName().compareTo(p2.getName()));
		
	    Collections.sort(person, (p1, p2) -> Double.compare(p1.getSalary(), p2.getSalary()));
		System.out.println(person);
	}

}
