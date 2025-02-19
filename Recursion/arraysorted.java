package Recursion;

public class arraysorted {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 3, 5 };
    System.out.println("array is sorted or not: " + arraysortedmethod(arr));
  }

  private static boolean arraysortedmethod(int[] arr) {
    return helperarraysorted(arr, 0);
  }

  private static boolean helperarraysorted(int[] arr, int i) {
    if (i == arr.length - 1) {
      return true;
    }
    return arr[i] < arr[i + 1] && helperarraysorted(arr, i + 1);
  }
}