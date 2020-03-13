package equals.case3;


public class Person {
	public Person(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson)
	{
		if(aPerson==null)
		{
			return false;
		}
		if(aPerson.getClass()!=this.getClass())
		{
			return false;
		}
		
		Person p = (Person) aPerson;
		boolean res= this.name.equals(p.name);
		return res;
	}
	//change from if (!(aPerson instanceof Person))
	

}