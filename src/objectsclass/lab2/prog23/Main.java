package objectsclass.lab2.prog23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DeptEmployee[] department = new DeptEmployee[5];

		Professor prof1 = new Professor("Prof1", 100, 1994, 7, 24);
		prof1.setNumberOfPublications(10);
		Professor prof2 = new Professor("Prof2", 100, 1994, 7, 24);
		Professor prof3 = new Professor("Prof3", 100, 1994, 7, 24);

		Secretary secre1 = new Secretary("Secretary 1", 100, 1994, 7, 24);
		secre1.setOvertimeHours(200);
		Secretary secre2 = new Secretary("Secretary 2", 100, 1994, 7, 24);

		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = secre1;
		department[4] = secre2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Type Y or y to print out sum of salary all department :");
		String input = sc.next();
		sc.close();
		if (input.equalsIgnoreCase("Y")) {
			double sum = 0.0;
			for (DeptEmployee dept_obj : department) {
				sum += dept_obj.computeSalary();
			}
			System.out.print("Total sum of all departments is : -> " + sum);

		}

	}

}
