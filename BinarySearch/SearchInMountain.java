package BinarySearch;

public class SearchInMountain {
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 9, 3, 4, 5};
		int target = 3;
		System.out.print(search(arr, target));	
		
	}
	static int search(int[] arr, int target)
	{
		int peak= isMountainArray(arr);
		int first = orderAgnosticBS(arr, target,0,arr.length-1);
		if(first!=-1)			
		{
			return first;
		}
		else
		{
			return orderAgnosticBS(arr,target,peak+1, arr.length-1);
		}
		
	}
	
	static int isMountainArray(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else
			{
				start=mid+1;
			}
		}
		return start;
	}
	
	  static int orderAgnosticBS(int[] arr, int target, int start, int end) {
	        // find whether the array is sorted in ascending or descending
	        boolean isAsc = arr[start] < arr[end];

	        while(start <= end) {

	            int mid = start + (end - start) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            }

	            if (isAsc) {
	                if (target < arr[mid]) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            } else {
	                if (target > arr[mid]) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            }
	        }
	        return -1;
	    }
}
