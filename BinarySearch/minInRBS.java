package BinarySearch;

public class minInRBS {

	public static void main(String[] args)
	{
		int[] arr= {3,1,2};
	
		int pivot = findPivot(arr);
		int findMIn=findMIn(arr,pivot);
		System.out.print(findMIn);
		
	}

private static int findMIn(int[] arr, int pivot) {
	//
	
	if(arr.length==2)
	{
		if(arr[0]>arr[1])
		{
			return arr[1];
		}
		else
			return arr[0];
	}
		
		if(pivot==-1)
		{
			return arr[0];
		}
		if(arr[pivot]>arr[pivot+1])
		{
		
			return arr[pivot+1];
		}
		else
		{
			return arr[pivot-1];
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

}