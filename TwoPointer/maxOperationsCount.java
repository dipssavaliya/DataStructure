import java.util.Arrays;

public class maxOperationsCount {
  public static void main(String[] args) {
    int[] nums = new int[]{3,1,3,4,3};
    System.out.println(maxOperations(nums,6));
  }
  public static int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);
    int i=0;
    int j=nums.length-1;
    int ans =0;
    while(i<=j)
    {
        if(nums[i]+nums[j]==k)
        {
            ans++;
            i++;
            j--;
        }
        else if(nums[i]+nums[j]<k)
        {
            i++;
        }
        else
        {
            j--;
        }
    }
    return ans;
}
}
