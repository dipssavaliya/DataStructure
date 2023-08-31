package BinarySearch;

public class BinarySearch {
	public static void main(String[] args)
	{
		int[] nums = {2,3,5,7,11,15};
		int target = 15;
		int ans = BinarySearchMethod(nums, target);
		System.out.print(ans);
	}

	private static int BinarySearchMethod(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
	
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(target<nums[mid])
			{
				end = mid-1;
			}
			else if(target>nums[mid])
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
