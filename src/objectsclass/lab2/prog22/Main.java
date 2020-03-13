package objectsclass.lab2.prog22;

public class Main {
	public static void main(String args[]) {


		
		Circle[] c_obj = { new Circle(5), new Cylinder(2, 4) };

		for (Circle obj : c_obj) {
			System.out.print("Get Area: -> " + obj.getArea() +"\n");
			if(obj instanceof Cylinder ) 
			{
				System.out.print(((Cylinder) obj).getVolume());
				
			}
		}
	}
}
