package data_structure.array.selection_sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
		int[] nums = {2,45,0,11,-9};
		//int[] nums = {2,8,5,3,9,4,1};
		//int[] nums = {16,35,7,1,4};
		for(int i=0; i<nums.length; i++)
		{
			for(int j =i+1; j<nums.length; j++)
			{
				if(nums[j]<nums[i])
				{
					int temp = nums[i];
					nums[i]= nums[j];
					nums[j]= temp;
				}
				
			}
			System.out.println(Arrays.toString(nums));
		}
		System.out.println(Arrays.toString(nums));
		
		

	}

}
