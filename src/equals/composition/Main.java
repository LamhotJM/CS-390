package equals.composition;

public class Main {

	public static void main(String args[]) {

		PersonWithJob withJob1 = new PersonWithJob("Joe", 100000);
		PersonWithJob withJob2 = new PersonWithJob("Joe", 100000);
		// true – using Person’s equals()
		// true – using Person’s equals()
		boolean theyreEqual1 = withJob1.equals(withJob2);
		boolean theyreEqual2 = withJob2.equals(withJob1);

		System.out.println(theyreEqual1);
		System.out.println(theyreEqual2);
	}

}
