package objectsclass.lab2.prog1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor("Prof 1", 500, 2016, 10, 1);
		Professor prof2 = new Professor("Prof 2", 500, 2016, 10, 1);
		Professor prof3 = new Professor("Prof 3", 500, 2016, 10, 1);
		prof1.setNumOfPublications(10);
		prof1.setNumOfPublications(10);
		prof1.setNumOfPublications(10);
		Secretary sec1 = new Secretary("Sec1", 500, 2016, 10, 1);
		Secretary sec2 = new Secretary("Sec2", 500, 2016, 10, 1);
		sec1.setOvertimeHours(2);
		sec2.setOvertimeHours(2);
		//Here the options
		// DeptEmployee[] department = new DeptEmployee[5];
		// department[0] = prof1;
		// department[1] = prof2;
		// department[2] = prof3;
		// department[3] = sec1;
		// department[4] = sec2;
		DeptEmployee[] department = { prof1, prof2, prof3, sec1, sec2 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Write/input Y to print all to sum all salary of all professor and secretary :");
		String input = sc.nextLine();
		sc.close();
		if (input.equalsIgnoreCase("Y")){
			double sum = 0;
			for (DeptEmployee emp : department) {
				sum += emp.computeSalary();

			}
			System.out.println(sum);
		} else {
			System.out.println("Please write/input Y!");
		}

	}

}
