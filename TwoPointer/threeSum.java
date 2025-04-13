package TwoPointer;

import java.util.Arrays;

public class threeSum {
  public static void main(String[] args) {
    int[] nums = new int[] { -1, 2, 1, -4 };
    int target = 1;
    System.out.println(threeSumClosest(nums, target));
  }

  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closestSum = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length - 1; i++) {
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
          closestSum = sum;
        }
        if (sum < target)
          left++;
        else if (sum > target)
          right--;
        else
          return sum;
      }
    }
    return closestSum;
  }

}
