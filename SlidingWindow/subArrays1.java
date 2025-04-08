package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class subArrays1 {
    public static void main(String[] args) {
      int[] nums = {1,1,2,2,3,4};
      int k = 6;
      int x = 2;
      int[] ans = findXSum(nums,k,x);
      for(int a :ans)
      {
        System.out.print(a);
      }
    }

    public static int[] findXSum(int[] nums, int k, int x) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<k;i++)
      {
          map.put(i,map.getOrDefault(map, 0)+1);
      }
     
      for(Map.Entry<Integer,Integer> entry: map.entrySet())
      {
       
      }

    }
}
