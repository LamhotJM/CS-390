package lab2.prog5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("Employee 1", 500, 2016, 10, 1);

		Manager m2 = new Manager("Manager 1", 300, 2016, 10, 1);
		m2.setBonus(100);
		m2.raiseSalary(10);
		// System.out.print(m2.getSalary());
		Manager m3 = new Manager("Manager 1", 200, 2016, 10, 1);

		Employee[] emps = { emp, m2, m3 };

		Scanner sc = new Scanner(System.in);

		Employee emp1 = new Employee("Employee1", 500, 2016, 10, 1);
		Employee emp2 = new Employee("Employee2", 500, 2016, 10, 1);

		System.out.println("emp1 name : " + emp1.getName() + " emp2 name : " + emp2.getName());
		swap(emp1, emp2);
		System.out.println("emp1 name : " + emp1.getName() + " emp2 name : " + emp2.getName());

		System.out.println("Write/input Y to print all to sum all salary of all managers :");
		String input = sc.nextLine();
		sc.close();
		if (input.equalsIgnoreCase("Y")) {
			for (Employee emp_o : emps) {
				System.out.println("name= " + emp_o.getName() + ",salary=" + emp_o.getSalary());
			}
		} else {
			System.out.println("Please write/input Y!");
		}

	}

	public static void swap(Employee emp1, Employee emp2) {
		Employee temp;
		temp = emp1;
		emp1 = emp2;
		emp2 = temp;
		System.out.println("emp1 name : " + emp1.getName() + " emp2 name : " + emp2.getName());
	}

}
