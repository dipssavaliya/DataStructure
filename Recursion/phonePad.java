package Recursion;

public class phonePad {
  static int number = 0;

  public static void main(String[] args) {
    pad("","21");
   System.out.println("count = "+padCount("","12"));
    //int ans = padCountPad(number,"","21");
   // System.out.println("total count of combination is : "+ans);
  }

  public static void pad(String processed, String up)
  {
    if(up.isEmpty())
    {
      System.out.println(processed);
      return;
    }
    int digit = up.charAt(0)-'0';
    for(int i=(digit-1)*3;i<digit*3;i++)
    {
      char ch = (char)('a'+i); 
      pad(processed+ch, up.substring(1));
    }
  }

  public static int padCount(String Processed, String up)
  {
    if(up.isEmpty())
    {
      return 1;
    }
    int count = 0;
    int digit = up.charAt(0)-'0';
    for(int i=(digit-1)*3;i<digit*3;i++)
    {
      char ch = (char)('a'+i);
      count = count + padCount(Processed+ch,up.substring(1));
    }
    return count;
  }
   
  public static int padCountPad(int number, String Processed, String up)
  {
   
    if(up.isEmpty())
    {
    return  1;
    }
    int digit = up.charAt(0)-'0';
    for(int i=(digit-1)*3;i<digit*3;i++)
    {
      char ch = (char)('a'+i);
     return padCountPad(number+1,Processed+ch,up.substring(1));
    }
  return number;
  }
}

