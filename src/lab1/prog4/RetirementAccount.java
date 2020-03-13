package lab1.prog4;

public class  RetirementAccount  extends Account{

	public RetirementAccount(Employee employee, double balance) {
		super(employee, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}
	
	

}