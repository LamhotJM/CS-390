package equals.money;

import equals.hw1.Person;

public class Test {
	
	public static void main(String args[])
	{
		Money income = new Money(55, "USD");
		Money expenses = new Money(55, "USD");
		boolean balanced = income.equals(expenses);
		System.out.println(balanced);
		
		Money cash = new Money(42, "USD");
		WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");
		
		
		 
		System.out.println(voucher.equals(cash));// false // As expected.
		System.out.println(cash.equals(voucher));  //true // That's wrong.
		
		
		Money cash2 = new Money(42, "USD");
		Voucher voucher2 = new Voucher(42, "USD", "Amazon");
		
		System.out.println("Composition I");
		
		System.out.println(voucher2.equals(cash2));// false // As expected.
		System.out.println(cash2.equals(voucher2));  //true // That's wrong.
		
		System.out.println("Composition II");
		Voucher voucher3 = new Voucher(42, "USD", "Amazon");
		Voucher voucher4 = new Voucher(42, "USD", "Amazon");
		

		System.out.println(voucher4.equals(voucher3));
		System.out.println(voucher3.equals(voucher4));
		
	}
	
	

}
