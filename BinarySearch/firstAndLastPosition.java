package BinarySearch;

import java.util.Arrays;

public class firstAndLastPosition {

	public static void main(String[] args) {
		// Input : 
		int[] nums = {1, 3, 5, 5, 5, 5, 67, 123, 125};
			int	target = 5;
			searchRange(nums,target);
		

	}

	public static void searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };
		// check for first occurrence if target first
		ans[0] = search(nums, target, true);
		if (ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}
		System.out.print(Arrays.toString(ans));
	}

// this function just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {
		int start=0; 
		int ans=-1;
		int end = nums.length-1;
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			if(target>nums[mid])
			{
				start=mid+1;
			}
			else if(target<nums[mid])
			{
				end=mid-1;
			}
			else
			{
				ans=mid;//potential ans
				if(findStartIndex)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		}
		return ans;
	
}
}
