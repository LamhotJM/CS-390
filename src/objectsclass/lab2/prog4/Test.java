package objectsclass.lab2.prog4;



class Test {
	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(5, 7), new Square(3),
				new Circle(3) };
	

		for (ClosedCurve cc : objects) {
			System.out.println(cc.getClass().getSimpleName()+ " ->" +cc.computeArea());
			

		}
	}
}
