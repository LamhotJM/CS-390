package day3;

class staticDemo {

	int x;
	static int y;

	public static void main(String[] args) {
		staticDemo ob1= new staticDemo();
		staticDemo ob2= new staticDemo();
		
		ob1.x=10;
		ob2.x=20;
		
		System.out.println("Ob1 -> " + ob1.x + " ob2 -> "+ ob2.x);
		ob1.y=19;
		
		System.out.println("Ob1y -> " + ob1.y + " ob2y -> "+ ob2.y);
		
		staticDemo.y=11;
		System.out.println("Static demo y -> " + staticDemo.y + " ob1y -> "+ ob1.y+ " ob1y -> "+ ob2.y);
		
		

	}
	
	static void print()
	{
		//System.out.print(x);
		// we can't access instant variable from static method
	}

}
