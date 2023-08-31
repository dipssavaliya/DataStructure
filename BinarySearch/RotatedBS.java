package BinarySearch;

public class RotatedBS {
	public static void main(String[] args)
	{
		//int[] arr = {12, 11, 3, 4, 9, 10};
		int[] arr = {1,3};
		int target=3;
	System.out.print(searchAns(arr,target));	
		
	}
	
	static int searchAns(int[] arr, int target)
	{
		int pivot = findPivot(arr);
		if(pivot==-1)
		{
			return BinarySearchMethod(arr,target,0,arr.length-1);
		}
		//case 1;
		if(arr[pivot]==target)
		{
			return pivot;
		}
		//caes2
		if(target>arr[0])
		{
			return BinarySearchMethod(arr, target, 0, pivot-1);			
		}
		else
		{
			return BinarySearchMethod(arr, target, pivot+1,arr.length-1);			
		}	
		
	}
	static int findPivot(int[] arr)
	{
		int start=0;
		int end= arr.length-1;
	    while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
