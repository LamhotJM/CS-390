package equals.case3_final;


public class Main {
	public static void main(String args[]) {
		Person x = new Person("X");
		Person y = new PersonWithJob("X", 5000);

		System.out.println(x.equals(y));

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


	}

}