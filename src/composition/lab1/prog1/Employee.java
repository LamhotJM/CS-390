package composition.lab1.prog1;

import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate hireDate;
	private Account savingsAcct;
	private Account retirementAcct;
	private Account checkingAcct;

	 Employee(String name, int year, int month, int dayOfMonth) {
		super();
		this.name = name;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
	}
	 
	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public String getFormattedInfo() {
		StringBuilder strBuild = new StringBuilder();
		strBuild.append("ACCOUNT INFO FOR :" + this.getName() + "\n");
		if (this.savingsAcct != null) {
			strBuild.append(savingsAcct.toString() + "\n");
		}
		if (this.checkingAcct != null) {
			strBuild.append(checkingAcct.toString() + "\n");
		}
		if (this.retirementAcct!= null) {
			strBuild.append(retirementAcct.toString() + "\n");
		}
		return strBuild.toString();
	} 

	public void createNewSavings(double startBal) {
		this.savingsAcct = new Account(this, AccountType.SAVING, startBal);

	}

	public void createNewChecking(double startBal) {
		this.checkingAcct = new Account(this, AccountType.CHECKING, startBal);

	}

	public void createNewRetirement(double startBal) {
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startBal);

	}

	public boolean withdraw(AccountType type, double amount) {
		switch (type) {
		case SAVING:
			return savingsAcct.makeWithdrawal(amount);
		case CHECKING:
			return checkingAcct.makeWithdrawal(amount);
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amount);
		default:
			return false;
		}
	}

	public void deposit(AccountType type, double amount) {
		switch (type) {
		case SAVING:
			savingsAcct.makeDeposit(amount);
			break;
		case CHECKING:
			checkingAcct.makeDeposit(amount);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amount);
			break;
		default:
			break;
		}

	}

}
