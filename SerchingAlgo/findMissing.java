package SerchingAlgo;

import java.util.Arrays;

public class findMissing {
	public static void main(String[] args) {
		int[] a = { 21, 23, 27, 25, 26, 22 };
		findMissingNumber(a);
	}

	private static void findMissingNumber(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1!=arr[i+1])
			{	int ans = arr[i]+1;
				System.out.println("Missing Number: "+ans);
			}
		}
	}
}
