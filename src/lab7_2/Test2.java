package lab7_2;

public class Test2 {

	public static void main(String[] args) {


		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3), new Retangle(3, 4) };
		// compute areas
		for (Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + " \n" + "Number of sides= "
					+ cc.getNumberOfSides() + "\n" + "Number of perimeter= " + cc.computePerimeter());

		}

	}

}