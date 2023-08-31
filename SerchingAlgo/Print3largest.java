package SerchingAlgo;

public class Print3largest {

	public static void main(String[] args) {
		int[] a = { 2, 45, 6, 78, 99 };
		Print3largestNumber(a);
	}

	private static void Print3largestNumber(int[] arr) {
		int three=Integer.MIN_VALUE;
		int two=Integer.MIN_VALUE;
		int one=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>one)
			{
				three=two;
				two=one;
				one=arr[i];
			}
			else if(arr[i]>two)
			{
				three=two;
				two=arr[i];
			}
			else if(arr[i]>three)
			{
				three=arr[i];
			}
		}
		System.out.println("three:" +three+"\n"+"two: "+two+"\n"+"one: "+one);
	}
}
