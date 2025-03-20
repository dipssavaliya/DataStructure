package Recursion;

public class eliminationGame {
  public static void main(String[] args) {
   System.out.println(eliminateMethod(9));
  }

  private static int eliminateMethod(int n) {
    int[] arr = new int[n];
    for (int i = 1; i <= n; i++) {
      arr[i - 1] = i;
    }
    return eliminatehelper(arr,0);
  }

  private static int eliminatehelper(int[] arr,int k) {
    if(arr.length==1)
    {
      return arr[0]; 
    }
    if(k==0){
      for(int i=1;i<arr.length;i=i+2)
      {
        arr[i-1]=arr[i];
      }
    return eliminatehelper(arr,1);
    }
    if(k==1)
    {
      for(int i=arr.length;i>0;i=i-2)
      {
        arr[i]=arr[i-1];
      } 
    return  eliminatehelper(arr,0);
    }
    return arr[0]; 
  }
}
