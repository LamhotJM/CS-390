package equals.hw2;

import equals.case2.Person;

public class Main {
	public static void main(String args[])
	{
		
		// salary not the same
		PersonWithJob joe1 = new PersonWithJob("Joe", 100000,1994,2,3);
		PersonWithJob joe2 = new PersonWithJob("Joe", 100000,1994,2,3); 
		boolean areTheyEqual = joe1.equals(joe2); //areTheyEqual== true
		System.out.println(areTheyEqual);// true, this is problem on sub class
		
		Person p = new Person("Joe");
		PersonWithJob withJob = new PersonWithJob("Joe",100000,1994,2,3);
		//true – using Person’s equals()
		boolean theyreEqual1 = p.equals(withJob);
		
		System.out.println(theyreEqual1);
		//false – using PersonWithJob’s equals()
		boolean theyreEqual2 = withJob.equals(p);
		System.out.println(theyreEqual2);
	}

}
