package BackTracking;

public class findPermutation {

  public static void main(String[] args) {
    String str="abc";
    
    permutation(str,"");
  }
  public static void permutation(String str, String ans)
  {
    //base case
if(str.length()==0)
{
  System.out.println(ans);
  return;
}
    //recursion//n*n!
    for(int i=0;i<str.length();i++)
    {
      char curr = str.charAt(i);
    String  nstr=str.substring(0, i)+str.substring(i+1);
      permutation(nstr, ans+curr);
    }
  }
}
