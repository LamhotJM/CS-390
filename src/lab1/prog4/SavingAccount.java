package lab1.prog4;

public class SavingAccount  extends Account{

	public SavingAccount(Employee employee, double balance) {
		super(employee, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public AccountType getAcctType() {
		return AccountType.SAVING;
	}
	
	

}