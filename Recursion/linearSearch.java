package Recursion;

public class linearSearch {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 45, 678, 34, 79 };
    int find = 34;
    int index = findelement(arr, find);
    System.out.println("element found at index :" + index);
  }

  private static int findelement(int[] arr, int find) {
    return helperfindelement(arr, find, 0);
  }

  private static int helperfindelement(int[] arr, int find, int index) {

    if (index == arr.length) {
      return -1;
    }
    if (arr[index] == find) {
      return index;
    }
    return helperfindelement(arr, find, index + 1);
  }
}
