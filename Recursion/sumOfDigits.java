package Recursion;

public class sumOfDigits {

	public static void main(String[] args) {
		int ans =sum(0107);
		System.out.println(ans);
	}

	public static int sum(int n) {
		if (n<1) {
			return 0;
		}
		return n % 10 + sum(n / 10);
	}
}
