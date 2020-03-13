package equals.money1;


final class PersonWithJob {
	private double salary;
	private Person P;

	PersonWithJob(String n, double s) {
      P = new Person(n);
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
	//	boolean isEqual = getName().equals(p.getName()) && this.salary == p.salary;
		return false;
	}

}