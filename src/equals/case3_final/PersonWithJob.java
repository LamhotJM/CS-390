package equals.case3_final;


final class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String n, double s) {
		super(n);
		this.salary = s;
	}

	public boolean equalsOld(Object withJob) {
		if (withJob == null)
			return false;
		if (!(withJob instanceof PersonWithJob))
			return false;

		PersonWithJob p = (PersonWithJob) withJob;
		boolean isEqual = getName().equals(p.getName()) && this.salary == p.salary;
		return isEqual;
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
