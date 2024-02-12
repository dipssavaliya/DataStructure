package LeetcodePractice;
public class pow {
  public static void main(String[] args) {
    powMethod(2.0,10);
  }

  private static void powMethod(double d, int i) {
    int ans=0;
    while(i>0){
      ans+=Math.pow(d,i);
    powMethod(d, i-1);
    }
System.out.println(ans);
System.out.println("Jay Ganesh");
  }

  
}
