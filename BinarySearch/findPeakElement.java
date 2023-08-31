package BinarySearch;

import java.util.Arrays;

public class findPeakElement {
	public static void main(String[] args) {
	int[] nums= {1,2,3,1};
	int ans1 = findPeakElements(nums);
	System.out.println(ans1);
	}


    public static int findPeakElements(int[] nums) {
     Arrays.sort(nums);
     System.out.println(Arrays.toString(nums));
     return nums.length-1;
      
	}
    

   
}