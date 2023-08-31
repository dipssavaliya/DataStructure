package Sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args)
	{
		int[] arr= {5,4,3,2,1};
		//bubbleSortMethod(arr);
		//System.out.println(Arrays.toString(arr));
		insertion(arr);
		System.out.println(Arrays.toString(arr));		
	}
	public static void insertion(int[] arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
				}
			}
		}
	}
	


	public static void bubbleSortMethod(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=1; j<arr.length-i; j++)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
				}
			}
		}
	}

static void selection(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			int lastIndex= arr.length-i-1;
			int maxElement = findMax(arr, 0, lastIndex);
			swap(arr,lastIndex,maxElement); 
			
		}
	}
	
	static void swap(int[] arr, int first, int last)
	{
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}
	
	private static int findMax(int[] arr, int start, int lastIndex) {
		int max=start;
		for(int i=start;i<=lastIndex;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		return max;
	}
}
