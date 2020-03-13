package equals.hw1;

public class C extends B {
	private int w=3;

	public C(int w) {
		super();
		this.w = w;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + w;
		return result;
	}

	
	
	
}
