package lambda;

public class LamdaExample {
	  public static void main(String[] args) {

	    // Implementing Runnable using anonymous class (Old way)
		  runableWithParameter("hello");
	  }
	  
	  private static void runableWithParameter(final String message) {
		    final Runnable runnable = ()->{
		        System.out.println(message);
		    };
		}

	}