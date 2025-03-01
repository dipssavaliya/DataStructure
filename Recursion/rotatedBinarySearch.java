package Recursion;

public class rotatedBinarySearch {
  public static void main(String[] args) {
    int[] arr = { 5, 6, 1, 2, 3, 4 };
    int find = 6;
    System.out.println(rotatedSearchusingRecursion(arr, find, 0, arr.length - 1));
  }

  private static int rotatedSearchusingRecursion(int[] arr, int find, int start, int end) {
    int mid = start + (end - start) / 2;
    if (find == arr[mid]) {
      return mid;
    }
    if (arr[start] <= arr[mid]) {
      if (find >= arr[start] && find <= arr[mid]) {
        return rotatedSearchusingRecursion(arr, find, start, mid - 1);
      } else {
        return rotatedSearchusingRecursion(arr, find, mid + 1, end);
      }
    }
    if (find >= arr[mid] && find <= arr[end]) {
      return rotatedSearchusingRecursion(arr, find, mid + 1, end);
    } else {
      return rotatedSearchusingRecursion(arr, find, start, mid - 1);
    }

  }

}
