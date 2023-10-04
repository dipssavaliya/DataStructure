package Recursion;

public class reverse {
	public static void main(String[] args)
	{
		//System.out.println(reverseno(567));
		System.out.println(reverse2(567));
	}

	static int sum=0;
	private static int reverseno(int i) {
		if(i/10==i)
		{
			return i;
		}
		int rem=i%10;
		sum=sum*10+rem;
		reverseno(i/10);
		return sum;
	}
	
	static int reverse2(int n)
	{
		int length= (int)(Math.log10(n))+1;
		int ans = helper(n,length);
		return ans;
	}

	private static int helper(int n, int length) {
		if(n%10==n) return n;
		//System.out.println("length="+length);
		//System.out.println((n%10)*(int)(Math.pow(10, length-1)));
		return (n%10)*(int)(Math.pow(10, length-1))+helper(n/10, length-1);
	}

}
