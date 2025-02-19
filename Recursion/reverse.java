package Recursion;

public class reverse {
  static int sum =0;
  private static void rev1(int n) {
    if(n==0)
    {return;}
    int rem=n%10;
    sum =(sum*10)+rem;
    rev1(n/10);
  }
private static int rev2(int n)
{
  int len = (int)(Math.log10(n))+1;
  return helper(n, len);
  }
  
    private static int helper(int n, int len) {
      if(n%10==n)
      {
        return n;
      }
      int rem = n%10;
      return rem * (int)Math.pow(10,len-1)+helper(n/10,len-1);
  }
    public static void main(String[] args) {
       System.out.println( rev2(1234));
        //System.out.println(sum);
      }
  
}
