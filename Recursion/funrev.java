package Recursion;

public class funrev {

	public static void main(String[] args)
	{
		funrevs(5);
		concept(4);
	}
	
	public static void funrevs(int n)
	{
		if(n==0)
		{
			return;
		}
		funrevs(n-1);
		System.out.println(n);
		
	}
	
	public static void concept(int n)
	{
		if(n==0)return;
		System.out.println(n);
		concept(--n);
	}
}
