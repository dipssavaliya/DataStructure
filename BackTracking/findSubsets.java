package BackTracking;

public class findSubsets {
 public static void main(String[] args) {
  String str = "abc";
  subset(str,"",0);
 } 

 public static void subset(String str, String ans, int i)
 {
    //base case
    if(i==str.length())
    {
      System.out.println(ans);
      return;
    }

    //recurssion
    subset(str, ans+str.charAt(i), i+1);
    subset(str, ans, i+1);
 }
}
