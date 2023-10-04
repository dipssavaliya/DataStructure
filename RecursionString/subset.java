package RecursionString;

import java.util.ArrayList;

public class subset {

	public static void main(String[] args)
	{
		subsetMethod("","abc");
		System.out.println(subsetMethodReturn("","def"));
	}

	private static void subsetMethod(String processed, String up) {
		if(up.isEmpty())
		{
			System.out.println(processed);
			return;
		}
		char ch = up.charAt(0);
		subsetMethod(processed+ch,up.substring(1));
		subsetMethod(processed, up.substring(1));
	}
	private static ArrayList<String> subsetMethodReturn(String processed, String up) {
		if(up.isEmpty())
		{
			ArrayList<String> lst = new ArrayList<String>();
			lst.add(processed);
			return lst;
		}
		char ch = up.charAt(0);
		 ArrayList<String> left=subsetMethodReturn(processed+ch,up.substring(1));
		ArrayList<String> right=subsetMethodReturn(processed, up.substring(1));
		
		left.addAll(right);
		return left;
	}
}
