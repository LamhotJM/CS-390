package innerclass.prob1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<Employee>();
		Employee emp1 = new Employee("Bob", 5008);
		Employee emp2 = new Employee("Bob", 3008);
		Employee emp3 = new Employee("Bob", 7008);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);

		for (Employee emp : emps) {
			System.out.println(emp.toString());
		}

	}

}
