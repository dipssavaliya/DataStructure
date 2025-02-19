package Recursion;

public class countzero {
 static int count =0;
  private static int countzero(int number)
  {
    if(number==0)
    {
      return count;
    }
      int rem = number%10;
      if(rem==0)
      count++;
      return countzero(number/10);
   }
  public static void main(String[] args) {
   System.out.println("total zero in the number is : "+countzero(13040000));
  }
  
}
