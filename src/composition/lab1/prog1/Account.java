package composition.lab1.prog1;

public class Account {

	private double balance;
	private AccountType accountType;
	
	

	public Account(AccountType accountType, Employee employee) {
		super();

	}

	public Account( Employee employee, AccountType accountType,double balance) {
		super();
		this.balance = balance;
		this.accountType= accountType;
	
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

	@Override
	public String toString() {
		return "Account type " + accountType+ " current balance = " + balance;
	}

}
