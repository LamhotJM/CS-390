package standard_exam.polymorphism.accounts;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum = 0;
		for (Employee emp : emps) {
			for (Account acc : emp.getAccounts()) {
				sum += acc.getBalance();
			}
		}

		return sum;
	}
}
