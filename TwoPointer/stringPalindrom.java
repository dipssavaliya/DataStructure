package TwoPointer;

public class stringPalindrom {

	public static void main(String[] args)
	{
		System.out.println(isPalindrome("aba"));
		
		 
	}

	public static boolean isPalindrome(String s) {
		
		String s1="";
        s= s.replace(" ",""); 
        s= s.replaceAll("\\p{Punct}", "");
        for(int i=s.length()-1;i>=0;i--)
        {
           s1=s1+s.charAt(i);
           
        }
        if(s.equalsIgnoreCase(s1))
        return true;

        return false;
    
    }
}
