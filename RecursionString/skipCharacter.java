package RecursionString;

public class skipCharacter {

	public static void main(String[] args) {
		skipcharMethod("", "abbacd");
		System.out.println(skipcharMethodReturn("","yiuyaauyuiysa"));
	}

	private static void skipcharMethod(String processed, String up) {
		if (up.isEmpty()) {
			System.out.println(processed);
			return;
		}
		char ch = up.charAt(0);
		if(ch=='a')
		{
			skipcharMethod(processed,up.substring(1));
		}
		else
		{
			skipcharMethod(processed+ch,up.substring(1));
		}
	}
	
	private static String skipcharMethodReturn(String processed, String up) {
		if (up.isEmpty()) {
			
			return processed;
		}
		char ch = up.charAt(0);
		if(ch=='a')
		{
			return skipcharMethodReturn(processed,up.substring(1));
		}
		else
		{
			return skipcharMethodReturn(processed+ch,up.substring(1));
		}
	}

}
