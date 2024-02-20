package BackTracking;

public class arrayBackTracking {
  public static void main(String[] args) {
    int[] arr=new int[5];
    change(arr, 0, 1);
    printArr(arr);
  }
  public static void printArr(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+"");
    }
    System.out.println();
  }
  public static void change(int[] arr,int i, int val)
  {
    //basecase
   if(i==arr.length)
   {
    printArr(arr);
    return;
   }
    //work
    arr[i]=val;//change value while calling recursion
    change(arr, i+1, val+1);//function call step
    arr[i]=arr[i]-2;//backtracking step
  }
}
