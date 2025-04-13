package Array;

public class minimiumOper {
  public static void main(String[] args) {
   int[] nums = {1,2,3,4,2,3,3,5,7};
    System.out.println(minimiumOpeationMeth(nums));
  }
  public static int minimiumOpeationMeth(int[] nums) {
    int n = nums.length;
    boolean[] seen = new boolean[101];
    for(int i = n - 1 ; i >= 0 ; i--){
        if(seen[nums[i]])
            return i / 3 + 1;
        else seen[nums[i]] = true;
    }
    return 0;
} 
  
}
