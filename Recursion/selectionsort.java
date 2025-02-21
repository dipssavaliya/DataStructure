package Recursion;

import java.util.Arrays;

public class selectionsort {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 6, 1 , 9, 4};
    selectionSortMethod(arr, arr.length-1,0,0);
    System.out.println(Arrays.toString(arr));
  }

  private static void selectionSortMethod(int[] arr, int row, int col, int maxIndex) {
    if(row==0)
    {
      return;
    }
    if(col<=row)
    {
      if(arr[maxIndex]<arr[col])
      maxIndex=col;
      selectionSortMethod(arr, row, col+1,maxIndex);
    }
    else{
      int temp = arr[maxIndex];
      arr[maxIndex] = arr[row];
      arr[row] = temp;
      selectionSortMethod(arr,row-1,0,maxIndex);
    }
  }
}