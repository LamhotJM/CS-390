package lab1.prog4;

public class CheckingAccount  extends Account{

	public CheckingAccount(Employee employee, double balance) {
		super(employee, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}
	
	

}
