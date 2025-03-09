public class LongestSeq {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {

        int[] ans = new int[nums.length];
       ans[0]=nums[0];
        for (int i =1;i<nums.length;i++) {
            if (nums[i] < ans[i - 1] || ans[i-1]!=nums[i]) {
                ans[i - 1] = nums[i];
            }
            else {
                ans[i] = nums[i];
            }
        }
        return ans[nums.length-1];

    }
}