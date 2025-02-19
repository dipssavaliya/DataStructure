package Recursion;

import java.util.ArrayList;

public class returnList {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 4 };
    int find = 4;
    ArrayList<Integer> list = findListItems(arr, find, 0);
    for(int a:list)
    {
      System.out.println(a);
    }
  }

  private static ArrayList<Integer> findListItems(int[] arr, int find, int index) {
    ArrayList<Integer> list = new ArrayList<>();
    if(index == arr.length)
    {
      return list;
    }
    if(arr[index]==find)
    {
       list.add(index);
    }
    ArrayList<Integer> prevList =  findListItems(arr,find,index+1);
    list.addAll(prevList);
    return list;
  }

}
