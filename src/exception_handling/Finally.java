package exception_handling;

class Finally {
	public static void test() throws Exception {
		try {
			// return;
            // System.exit(0);
             throw new Exception("first");
             
		} catch (Exception x) {
           // 1 // 2 // 3a
		  System.out.println(x.getMessage());
          throw new Exception("second"); // 3b
		} finally {
			System.out.println("finally!");
		}
		//System.out.println("last statement");
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception x) {
			System.out.println(x.getMessage());
		}
	}
}