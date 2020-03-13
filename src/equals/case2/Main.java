package equals.case2;

public class Main {
	public static void main(String args[])
	{
		// already false since, there is an override equals on sub class method
		PersonWithJob joe1 = new PersonWithJob("Joe", 100000);
		PersonWithJob joe2 = new PersonWithJob("Joe", 50000); 
		boolean areTheyEqual = joe1.equals(joe2); 
		System.out.println(areTheyEqual);
		
		Person p = new Person("Joe");
		PersonWithJob withJob = new PersonWithJob("Joe",100000);
		//true – using Person’s equals()
		boolean theyreEqual1 = p.equals(withJob);
		
		System.out.println(theyreEqual1);
		//false – using PersonWithJob’s equals()
		//violent symmetric: x.equals(y) must return the same result as y.equals(x)
		boolean theyreEqual2 = withJob.equals(p);
		System.out.println(theyreEqual2);
		
	}

}
