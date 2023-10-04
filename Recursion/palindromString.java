package Recursion;

public class palindromString {

	public static void main(String[] args) {
		String test = "abcba";
		System.out.println(palin(test));
	}

	private static boolean palin(String test) {
		if (test.length() == 0 || test.length() == 1)
			return true;
		//System.out.println(test.charAt(1));
		if(test.charAt(0)==test.charAt(test.length()-1))//becuase charat internally takes byte array, 
														//that is why--length-1
			return palin(test.substring(1, test.length() - 1));//actually we want to avois last char

		return false;
	}
}
