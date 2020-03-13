package equals.case3;

class PersonWithJobWithCounter extends PersonWithJob {
	static private int counter;

	PersonWithJobWithCounter(String n, double s) {
		super(n, s);
		counter++;
	}
}