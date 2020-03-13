package lab7_2.polygon;


public interface Polygon {
  // final int UB = 0;

	abstract public double[] getArrayOfSides();


	static double sum(double[] arr) {// static method is utility
		double sum = 0;
		for (double d : arr) {
			sum += d;
		}
		return sum;
	}

	default double computePerimeter() { // helper method, implicitly public 
		return sum(getArrayOfSides());
	}

}
