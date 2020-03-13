package lab7_2;

public class Test3 {

	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
				new Square(3),
				new Circle(3),
				new Retangle(3,4)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println( "The area of this " + cc.getClass().getSimpleName() + " \n"+ cc.computeArea());

		}


	}

}