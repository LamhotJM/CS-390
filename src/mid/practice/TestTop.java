package mid.practice;

public class TestTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Middle.MiddleInner mm= new Bottom(); 
		Top t= mm;
		System.out.println(t.num());

	}

}
