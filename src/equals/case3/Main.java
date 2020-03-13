package equals.case3;


public class Main {
	public static void main(String args[]) {
		PersonWithJob joe1 = new PersonWithJob("Joe", 100000);
		PersonWithJob joe2 = new PersonWithJob("Joe", 50000);
		boolean areTheyEqual = joe1.equals(joe2); // areTheyEqual== true
		System.out.println(areTheyEqual);

		Person p = new Person("Joe");
		PersonWithJob withJob = new PersonWithJob("Joe", 100000);
		// true – using Person’s equals()
		boolean theyreEqual1 = p.equals(withJob);

		System.out.println(theyreEqual1);
		// false – using PersonWithJob’s equals()
		boolean theyreEqual2 = withJob.equals(p);
		System.out.println(theyreEqual2);

		PersonWithJob joe3 = new PersonWithJob("Joe", 50000);
		PersonWithJobWithCounter joe4 = new PersonWithJobWithCounter("Joe", 50000);
		joe4.equals(joe3); // value is false since joe2 //is not of same type as joe1
		// this also check get class instead of instance of
		
		Math.sqrt(-50);


		
	
	}

}