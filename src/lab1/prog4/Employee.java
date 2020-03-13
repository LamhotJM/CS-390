package lab1.prog4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Employee {

	private String name;
	private LocalDate hireDate;
	// private Account savingsAcct;
	// private Account retirementAcct;
	// private Account checkingAcct;
	private List<Account> accounts =new ArrayList<Account>(); // this is container all of account

	public List<Account> getAccounts() {
		return accounts;
	}

	Employee(String name, int year, int month, int dayOfMonth) {
		super();
		this.name = name;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
		//this.accounts = new ArrayList<Account>(); option

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
		for(Account account:accounts)
		{
			strBuild.append(account.toString() +"\n");
			
		}
		return strBuild.toString();
	}

	public void createNewSavings(double startBal) {
		// this.savingsAcct = new Account(this, AccountType.SAVING, startBal);
		Account savingAcc = new SavingAccount(this, startBal);
		accounts.add(savingAcc);

	}

	public void createNewChecking(double startBal) {
		// this.checkingAcct = new Account(this, AccountType.CHECKING, startBal);
		Account checkAcc = new CheckingAccount(this, startBal);
		accounts.add(checkAcc);

	}

	public void createNewRetirement(double startBal) {
		// this.retirementAcct = new Account(this, AccountType.RETIREMENT, startBal);
		Account retirementAcc = new RetirementAccount(this, startBal);
		accounts.add(retirementAcc);

	}
//
//	public boolean withdraw(AccountType type, double amount) {
//		switch (type) {
//		case SAVING:
//			return savingsAcct.makeWithdrawal(amount);
//		case CHECKING:
//			return checkingAcct.makeWithdrawal(amount);
//		case RETIREMENT:
//			return retirementAcct.makeWithdrawal(amount);
//		default:
//			return false;
//		}
//	}
	
	public boolean withdraw(int accountIndex, double amt)
	{
		Account selected = accounts.get(accountIndex); 
		return selected.makeWithdrawal(amt); //(Notice the nice use of polymorphism here.)

	}

//	public void deposit(AccountType type, double amount) {
//		switch (type) {
//		case SAVING:
//			savingsAcct.makeDeposit(amount);
//			break;
//		case CHECKING:
//			checkingAcct.makeDeposit(amount);
//			break;
//		case RETIREMENT:
//			retirementAcct.makeDeposit(amount);
//			break;
//		default:
//			break;
//		}
//
//	}
	
	public void deposit(int accountIndex, double amt)
	{
		Account selected = accounts.get(accountIndex); 
		selected.makeDeposit(amt); //(Notice the nice use of polymorphism here.)

	}

}
