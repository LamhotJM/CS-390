package equals.hw2;


class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String n, double s,int year, int month, int dayOfMonth) {
            super(n, year,month, dayOfMonth);
            this.salary = s;
	}
	
	@Override
	public boolean equals(Object withJob) {
		if (withJob == null)
			return false;
		if (withJob.getClass() != this.getClass()) {
			return false;
		}
		PersonWithJob p = (PersonWithJob) withJob;
		boolean isEqual = getName().equals(p.getName()) && this.salary == p.salary;
		return isEqual;
	}

}
