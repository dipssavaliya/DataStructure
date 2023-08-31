package BinarySearch;

import java.util.Arrays;

public class twoSum {
	public static void main(String[] args)
	{
		twoSum tS = new twoSum();
		int[] sum = {-1,0};
		int target = -1;
		System.out.println(Arrays.toString(tS.searchTwoSum(sum, target)));
	}

	public int[][] searchTwoSum(int[] arr, int target)
	{
		 int start=0;
	        int end= arr.length-1;
	        int ans1=0;
            int ans2=0;
            int findVal=0;
	        while(start<=end)
	        {
	            int mid = start+(end-start)/2;
	            
	           
	            if(target==arr[mid])
	            {
	                ans1=mid;
	                break;
	            }
	            else if(target>arr[mid])
	            {
	                start=mid+1;
	                end=arr.length-1;
	                if(findVal==0) {
	                findVal=target-arr[mid];
	                ans2=mid;
	                target=findVal;}
	            }
	            else
	            {
	                end=mid-1;
	                start=0;
	                if(findVal==0) {
	                findVal= target-arr[mid];
	                ans2=mid;
	                target=findVal;}
	            }
	            
	        }
	        System.out.println(ans1);
	        System.out.println(ans2);
	        return new int[ans1][ans2];
	}
}
