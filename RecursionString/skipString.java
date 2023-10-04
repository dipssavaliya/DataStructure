package RecursionString;

import java.util.ArrayList;

public class skipString {

	public static void main(String[] args)
	{
		skipStringMethod("","bcapplebjapphgjh");
	}
	
	private static void skipStringMethod(String processed, String up) {
		if(up.isEmpty())
		{
			System.out.println(processed);
			return;
		}
		char c = up.charAt(0);
		if(up.startsWith("app") && !up.startsWith("apple"))
		{
			skipStringMethod(processed,up.substring(5));
		}
		else
		{
			skipStringMethod(processed+c, up.substring(1));
		}
	}

	private static ArrayList<String> skipStringMethodReturn(String processed, String up) {
		if(up.isEmpty())
		{
			ArrayList<String> lis = new ArrayList<>();
			lis.add(processed);
			return lis;
		}
		char c = up.charAt(0);
		if(up.startsWith("app") && !up.startsWith("apple"))
		{
			return skipStringMethodReturn(processed,up.substring(5));
		}
		else
		{
			return skipStringMethodReturn(processed+c, up.substring(1));
		}
	}
}
