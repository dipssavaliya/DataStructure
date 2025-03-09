package TwoPointer;
public class isSubsequence{
  
 public static void main(String[] args) {
    System.out.println(isSubsequenceMehotod("abc","aghjgbfhc"));
 }
 public static boolean isSubsequenceMehotod(String s, String t) {
        int left = 0;
        int right =0;
        while(right<t.length())
        {
            char ch = s.charAt(left);
            if(t.charAt(right)==ch)
            {
                left++;
            }
            right++;
        }
        return left==s.length();
    }
 }