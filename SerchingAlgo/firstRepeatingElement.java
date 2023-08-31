package SerchingAlgo;

import java.util.Arrays;

public class firstRepeatingElement {

	public static void main(String[] args) {
		int[] a = { 21, 23, 22, 25, 26, 22, 25 };
		firstRepeatingNumber(a);
	}

	private static void firstRepeatingNumber(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
				break;
			}
			
		}
	}

}
