package Array;

public class validMountainArray {
  
public static void main(String[] args) {
  int[] arr= {9,8,7,6,5,4,3,2,1};
  System.out.println(validMountainArrayMethod(arr));
}


public static boolean validMountainArrayMethod(int[] arr) {
  int pivot =0;
  int pivotindex = 0;
      for(int i=0;i<arr.length-1;i++)
      {

        if(arr[i]>arr[i+1])
        {
          pivot = arr[i];
          pivotindex =i;
          break;
        }
      }        

      for(int i=0;i<=pivotindex;i++)
      {
        if(arr[i]==arr[i+1])
        return false;
      }
      for(int i=pivotindex+1;i<arr.length-1;i++)
      {
        if(arr[i]<=arr[i+1])
        return false;
      }
      return true;
}

}