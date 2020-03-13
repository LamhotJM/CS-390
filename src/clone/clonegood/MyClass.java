package clone.clonegood;

// Developer is now able to declare that class is available for cloning public
class MyClass implements Cloneable {
	String name = "harry";

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
