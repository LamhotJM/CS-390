package objectsclass.lab2.prog21;

public final class Triangle{
	/* we require height <= base */
	final double base;
	final double height;
 
	Triangle(double base, double height) {
		if (height <= base) {
			this.base = base;
			this.height = height;
		} else {
			this.base = height;
			this.height = base;
		}
		assert (height <= base);
	}

	double computeArea() {
		return (0.5 * base * height);
	}
}