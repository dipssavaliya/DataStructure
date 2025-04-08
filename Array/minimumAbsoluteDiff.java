package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumAbsoluteDiff {
  public static void main(String[] args) {
    int[] arr = {4,2,1,3};
    minimumAbsoluteDiffMethod(arr);
  }

  private static void minimumAbsoluteDiffMethod(int[] arr) {
    List<List<Integer>> res = new ArrayList();
        //sort elements
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        for(List<Integer>  a : res)
        {
          System.out.println(a);
        }
} 
}
