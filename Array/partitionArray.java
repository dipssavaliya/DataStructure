package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class partitionArray {
    public static void main(String[] args) {
        int[] arr = new int[]{9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(arr,10)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> listLeft = new ArrayList<>();
        List<Integer> listPivot = new ArrayList<>();
        List<Integer> listRight = new ArrayList<>();
        int countPivot =0;
        int countRight =0;
        int[] ans = new int[nums.length];
        for (int num : nums) {
            if (num < pivot) {
                listLeft.add(num);
            }
            else if(num == pivot) {
                listPivot.add(num);

            }else{
                listRight.add(num);
            }
        }
        for(int i = 0; i < listLeft.size(); i++){
            ans[i] = listLeft.get(i);
        }
        for(int j = listLeft.size(); j < listLeft.size()+listPivot.size(); j++){
            ans[j] = listPivot.get(countPivot);
            countPivot++;

        }
        for(int k=listLeft.size()+listPivot.size();k<ans.length;k++){
            ans[k] = listRight.get(countRight);
            countRight++;
        }
        return ans;
    }
}