package exception_handling.prog21_1;

public class Test {

	public static void main(String[] args) {

		// try {
		ClosedCurve[] objects = null;
		try {
			objects = new ClosedCurve[] { new Triangle(-24, 5, 6), new Square(3), new Rectangle(-13, 7), new Circle(3) };

		} catch (IllegalTriangleException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalClosedCurveException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (ClosedCurve cc : objects) {
			String nameOfCurve = getClassNameNoPackage(cc.getClass());

			System.out.println("The area of this " + nameOfCurve + " is " + cc.computeArea());

		}


	}

	public static String getClassNameNoPackage(Class aClass) {
		String fullClassName = aClass.getName();
		int index = fullClassName.lastIndexOf('.');
		String className = null;
		String packageName = null;

		// in this case, there is no package name
		if (index == -1) {
			return fullClassName;
		} else {
			// for other apps, may be useful to have this
			packageName = fullClassName.substring(0, index);

			className = fullClassName.substring(index + 1);
			return className;
		}

	}

}
