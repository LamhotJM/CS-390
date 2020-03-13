package lab2.prog5;

import java.time.LocalDate;

public class Employee {
	public Employee(String name, double salary, int year, int month, int dayOfMonth) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
	}

	private String name;
	private double salary;
	private LocalDate hireDate;
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public double raiseSalary(double byPercent) {
		salary = salary + (byPercent/100)*salary;
		return salary ;
	}
	
}
