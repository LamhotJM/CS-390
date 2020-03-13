package lab1.prog4;

//previous class public class Account { 
public abstract class Account {
	private double balance;
	//private AccountType accountType;

	abstract public AccountType getAcctType(); ///would be error if not abstract
	
	public Account( Employee employee) {
		super();

	}

	public Account( Employee employee,double balance) { //delete  accountType from the constructor
		super();
		this.balance = balance;
	//	this.accountType= accountType;
	
	}

	public double getBalance() {
		return balance;
	}

	public void makeDeposit(double amount) {
		this.balance += amount;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > balance) {
			return false;
		} else {
			balance -= amount;
		}
		return true;

	}

	/*@Override
	public String toString() {
		return "Account type " + accountType+ " current balance = " + balance;
	}*/
	
	public String toString() {
		return "Account type " + getAcctType()+ " current balance = " + balance;
	}

}
