package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets
{
  public static void main(String[] args)
  {
    List<List<Integer>> resultsets = new ArrayList<>();
    int[] nums = {1,2,3};
     List<List<Integer>> ans = findSubsets(resultsets,new ArrayList<>(),nums,0);
    //ans.stream().flatMap(List::stream).map(String::valueOf).forEach(System.out::println);
    for(List<Integer> subset : ans)
    {
      for(Integer arr : subset)
      {
        System.out.print(arr);
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> findSubsets(List<List<Integer>> result,List<Integer> tempset,  int[] nums, int index)
  {
    result.add(new ArrayList<>(tempset));
    for(int i=index;i<nums.length;i++)
    {
      tempset.add(nums[i]);
      findSubsets(result,tempset,nums,i+1); 
      tempset.remove(tempset.size()-1);
    }
    return result;
  }

}