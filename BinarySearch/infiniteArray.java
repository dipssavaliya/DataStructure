package BinarySearch;

public class infiniteArray {
	public static void main(String[] args)
	{
		  int[] arr = {3, 5, 7, 9, 10, 90,
	                100, 130, 140, 160, 170};
	        int target = 10;
	        System.out.println(ans(arr, target));
		
	}
	 static int ans(int[] arr, int target) {
		 int start=0;
		 int end=1;
		 while(target>arr[end])
		 {
			 int newStart = end+1;
			 end=end+(end-start+1)*2;
			 start=newStart;
		 }
		 return BinarySearchMethod(arr,target,start,end);
	 }
		private static int BinarySearchMethod(int[] nums, int target, int start, int end) {
			
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
