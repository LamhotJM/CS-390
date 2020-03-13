package day1.session1;

public class Incremental {
	public static void main(String args[])
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		int j=0;
		int e =++j; // add before the assign
		int k =0;
		int f=k++; // add after assign
		
		--a;
		System.out.println("-- before " + a);
		b--;
		System.out.println("-- after " + b);
		++c;
		System.out.println("++ before " + c);
	//	d++;
		System.out.println("++ after d " + d++);
		
		System.out.println("++ before of e " + e);
		System.out.println("++ after of f " + f);
		
		
		
	}

}
