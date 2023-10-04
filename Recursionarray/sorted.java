package Recursionarray;

public class sorted {
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,6,4,5};
		System.out.println(sortedcheck(arr));
	}
	
	static boolean sortedcheck(int[] arr)
	{
		return helper(arr,0);
	}

	private static boolean helper(int[] arr, int i) {
		if(i==arr.length-1)return true;
		return (arr[i]<arr[i+1])&& helper(arr,i+1);
			
	}

}
