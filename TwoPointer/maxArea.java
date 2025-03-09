package TwoPointer;

public class maxArea {
  public static void main(String[] args) {
    int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxAreaMethod(arr));
  }

  private static int maxAreaMethod(int[] arr) {
    int left = 0; 
    int right = arr.length-1;
    int max = Integer.MIN_VALUE;
   for(int i=0;i<arr.length;i++)
   {
    int area = 0;
      
      if(arr[left]<arr[right])
      {
         area=arr[left]*Math.abs(right-left);
        left++;
      }
      else{
         area=arr[right]*Math.abs(left-right);
        right--;
      }
      if(max<area)
      {
        max=area;
      }
   }
   return max;
  }
}
