package mid.array;

import java.util.Arrays;

public class ArrCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] old =  {1,2,3,5,7,11};
		int [] new_arr= {1001,1002,1003,1004,1005,1006,1007};
		
		System.arraycopy(old, 2, new_arr, 3, 4);
		System.out.println(Arrays.toString(new_arr));

	}

}
