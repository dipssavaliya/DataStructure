package Recursionarray;

public class findIndex {
	
	
	public static void main(String[] args)
	{
		int[] arr= {3,4,5,6,7};
		int target=7;
		System.out.println(findIndexMethod(arr, target,0));
	}

	static int findIndexMethod(int[] arr, int target, int index)
	{
		if(index==arr.length)return -1;
		if(arr[index]==target)return index;
		else
			return findIndexMethod(arr, target, index+1);
		
	}
}
