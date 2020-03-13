package equals.money1;

public class Test {
	
	public static void main(String args[])
	{
		Money income = new Money(55, "USD");
		Money expenses = new Money(55, "USD");
		boolean balanced = income.equals(expenses);
		//System.out.println(balanced);
		
		Money cash = new Money(42, "USD");
		WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");
		 
		
		System.out.println(cash.equals(voucher));  //true // That's wrong.
		System.out.println(voucher.equals(cash));// false // As expected.
	}

}
