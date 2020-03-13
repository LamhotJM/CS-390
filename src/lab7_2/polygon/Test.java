package lab7_2.polygon;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//ClosedCurve x = new ClosedCurve(); 

	   Polygon [] objects = { new Triangle(4, 5, 6), new Square(3), new Retangle(3, 4) };
		// compute areas
		for(Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + " \n" + "Number of sides= "
					+ Arrays.toString(cc.getArrayOfSides()) + "\n" + "Number of perimeter= " + cc.computePerimeter());

		}


	}

}