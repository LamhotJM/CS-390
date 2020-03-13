package objectsclass.lab2.prog21;

class Test {
	public static void main(String[] args) {

		Triangle tri = new Triangle(5, 7);
		System.out.println("Area of Triangle " + tri.computeArea());
		Retangle ret = new Retangle(3, 4);
		System.out.println("Area of Retangle " + ret.computeArea());
		Circle cir = new Circle(3);
		System.out.printf("Area of Circle %.2f ", cir.computeArea());
 
	}
}
