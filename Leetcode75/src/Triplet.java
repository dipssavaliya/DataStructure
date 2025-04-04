public class Triplet {
    public static void main(String[] args) {
        int[] nums = {6,4,1,2,3};
        System.out.println(increasingTriplet(nums));
    }

    int count = 0;
    public static boolean increasingTriplet(int[] nums) {
        for(int i=0; i<nums.length-2;i++)
        {
            if(nums[i]<nums[i+1]) {
                if (nums[i + 1] < nums[i + 2])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
