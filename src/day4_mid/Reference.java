package day4_mid;

class Number {
	protected int x;
}

public class Reference {
	static int kul;

	public Reference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Number a = new Number();
		a.x= 4;
		System.out.println(a.x); //4
		Number b=a;// b and a pointing to same reference, so  thats why a.x would be five
		b.x=5;
		System.out.println(b.x);//5
		System.out.println(a.x);//

	}
	
	public static void test() {
		Number a = new Number();
		a.x= 4;
		System.out.println(a.x); //4
		Number b=a;// b and a pointing to same reference, so  thats why a.x would be five
		b.x=5;
		System.out.println(b.x);//5
		System.out.println(a.x);//
		
		System.out.println(kul);//
		
		

	}


}
