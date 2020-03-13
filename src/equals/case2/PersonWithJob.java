package equals.case2;

  class  PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String n, double s) {
		super(n);
		this.salary = s;
	}

	@Override
	public boolean equals(Object withJob) {
		if (withJob == null)
			return false;
		if (!(withJob instanceof PersonWithJob))
			return false;

		PersonWithJob p = (PersonWithJob) withJob;
		boolean isEqual = getName().equals(p.getName()) && this.salary == p.salary;
		return isEqual;
	}

}
