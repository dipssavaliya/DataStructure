package Recursion;

public class binarySearch {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 34, 56, 78, 98 };
    int find = 56;
    int ans = binarySearchRecusrionMethod(arr, find);
    System.out.println("element found at index : "+ ans);
  }

  private static int binarySearchRecusrionMethod(int[] arr, int find) {
   
    int lengtharr = arr.length-1;
    int mid = arr[lengtharr/2];
    int midindex = lengtharr/2;
    if(mid == find)
    {
      return midindex;
    }
    else if(find>arr[mid])
    {
      return helperBinaryRecusrionRight(arr,midindex,arr.length-1,find);
    }
    else{
return helperBinaryRecusrionLeft(arr,0,midindex-1,find);
    }

  }

  private static int helperBinaryRecusrionLeft(int[] arr, int startindex, int endindex, int find) {
    if(find==arr[startindex])
    {
      return startindex;
    }
    return helperBinaryRecusrionLeft(arr,startindex+1,endindex,find);


  }

  private static int helperBinaryRecusrionRight(int[] arr, int startindex, int endindex, int find) {
    
    if(find==arr[startindex])
    {
      return startindex;
    }
    return helperBinaryRecusrionRight(arr,startindex+1,endindex,find);
  }
}
