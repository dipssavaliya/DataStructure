package Array;
import java.util.Arrays;

public class minimumOperations {
  public static void main(String[] args) {
    int[] arr= {1,2,3,4,2,3,3,5,7};
    System.out.println(minimumOperationsMethod(arr));
  }
  public static int minimumOperationsMethod(int[] nums)
  {
    int[] hash = new int[101];
    for(int num:nums)
    hash[num]++;
    //hash[num]++;
   // System.out.println(Arrays.toString(nums));

    int ans=0;
    int idx =0;
    while (!unique(hash)) {
      int count =3;  
      while(idx<nums.length && count-->0)
      {
        hash[nums[idx]]--;
        idx++;
      }
      ans++;     
    }
    return ans;
  }
  private static boolean unique(int[] hash)
  {
    for(int i=0;i<hash.length;i++)
    {
    if(hash[i]>1)
    return false;
   
    }
    return true;
  }
}
