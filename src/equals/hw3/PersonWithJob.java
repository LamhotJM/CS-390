package equals.hw3;


final class PersonWithJob {
	private double salary;
	private Person value;

	PersonWithJob(String n, int year, int month, int dayOfMonth, double s) {
		this.value = new Person(n,year,month, dayOfMonth);
		this.salary = s;
	}
	
	
	@Override
    public boolean equals(Object o) {
        if (o == this)
        	
            return true;
        if (o.getClass()!=this.getClass())
            return false;
        PersonWithJob other = (PersonWithJob) o;
        boolean valueEquals = (this.value == null && other.value == null)
          || (this.value != null && this.value.equals(other.value));
        boolean salaryEquals = (this.salary== 0 && other.salary== 0)
          || (this.salary != 0 && this.salary ==(other.salary));
        return valueEquals && salaryEquals;
    }
 

}
