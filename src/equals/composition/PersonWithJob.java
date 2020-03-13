package equals.composition;


final class PersonWithJob {
	private double salary;
	private Person value;

	PersonWithJob(String n, double s) {
		this.value = new Person(n);
		this.salary = s;
	}
	
	
	@Override
    public boolean equals(Object o) {
//        if (o == this)
//            return true;
//        if (!(o instanceof PersonWithJob))
//            return false;
//        PersonWithJob other = (PersonWithJob) o;
//        boolean valueEquals = (this.value == null && other.value == null)
//          || (this.value != null && this.value.equals(other.value));
//        boolean salaryEquals = (this.salary== 0 && other.salary== 0)
//          || (this.salary != 0 && this.salary ==(other.salary));
//        return valueEquals && salaryEquals;
		
		
		if(o==null)
		{
			return false;
		}
		if(!(o instanceof PersonWithJob))
		{
			return false;
		}
		PersonWithJob obj   = (PersonWithJob) o;
		PersonWithJob other = (PersonWithJob) o;

		boolean res =( this.value.equals(obj.value) && this.salary ==(obj.salary));
		return res;
    }
 

}
