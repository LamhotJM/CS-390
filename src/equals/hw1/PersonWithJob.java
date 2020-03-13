package equals.hw1;

class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String n, double s,int year, int month, int dayOfMonth) {
            super(n, year,month, dayOfMonth);
            this.salary = s;
	}

}
