package composition.address;

public class Main {
	public static void main(String args[]) {
		final String findCity="Chicago";
		Customer cus = new Customer("Lamhot", "Siagian", "ssn:332-221-4444");
		cus.setBillingAddress(new Address("a","Chicago","b","d"));
		cus.setShippingAddress(new Address("c","v","n","m"));
		
		Customer cus2 = new Customer("Lamhot 2", "Siagian", "ssn:332-221-4444");
		cus2.setBillingAddress(new Address("a","Bondol","b","d"));
		cus2.setShippingAddress(new Address("c","Bondol","n","m"));
		
		Customer cus3 = new Customer("Lamhot 3", "Siagian", "ssn:332-221-4444");
		cus3.setBillingAddress(new Address("a","Bondol","b","d"));
		cus3.setShippingAddress(new Address("c","Bondol","n","m"));
		
		Customer [] customers= {cus,cus2,cus3};
		
		for(Customer cust: customers)
		{
			if(findCity.equals(cust.getBillingAddress().getCity()))
			{
				System.out.println(cust.toString());
				
			}
		}

	}
}
