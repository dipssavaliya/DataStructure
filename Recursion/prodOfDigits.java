package Recursion;

public class prodOfDigits {
	public static void main(String[] args) {
		System.out.println(prodOfdigt(56));
	}

	public static int prodOfdigt(int n) {
		if(n/10==n)
		{
			return n;
		}
		//n%10==n return n
		return (n%10)*prodOfdigt(n/10);
	}
}
