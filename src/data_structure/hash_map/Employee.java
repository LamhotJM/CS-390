package data_structure.hash_map;

import java.util.HashMap;
public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap<String, Double>();

	public void addEntry(String date, double salary) {
		// implement
		// salaryRecord =
		salaryRecord.put(date, salary);
	}

	public void printPaymentAmount(String date) {

		if (salaryRecord.containsKey(date)) {
			System.out.println(firstName + " " + lastName + " was paid " + salaryRecord.get(date) + " on " + date);

		} else {
			System.out.println(firstName + " " + lastName + " did not receive a paycheck on " + date);
		}

	}

	public void printAveragePaycheck() {
		// implementAverage paycheck for Jim Jones was 3097.

		double sum = 0;
		for (double key : salaryRecord.values()) {
			sum += key;

		}

		System.out.println("Average paycheck for " + firstName + " " + lastName + " " + sum / salaryRecord.size());
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 0; i < 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();

		/*
		 * 
		 * 1/15/2011 3,005.50 2/15/2011 3,150.00 3/15/2011 4,200.00 4/15/2011 2,988.50
		 */

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
