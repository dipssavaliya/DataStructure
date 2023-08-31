package BinarySearch;

public class mountainArray {
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 9, 8, 7, 6, 5};
		
		int index= isMountainArray(arr);
		System.out.print(index);
		
		
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
	

}
