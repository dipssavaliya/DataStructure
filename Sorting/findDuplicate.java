package Sorting;


import java.util.ArrayList;
import java.util.List;

public class findDuplicate {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int ans = findDuplicates(nums);
		System.out.println(ans);
	}

	public static int findDuplicates(int[] nums) {
		int i = 0;
		List<Integer> lst = new ArrayList<>();
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) 
			{
				swap(nums, i, correct);
			} 
			else 
			{
				i++;
			}
		}
		for(int index=0;index<nums.length;index++)
		{
			if(nums[index]!=index+1)
			{
				return nums[index];
			}
		}
		return -1;

	}

	public static void swap(int[] nums, int i, int correct) {
		int temp = nums[correct];
		nums[correct] = nums[i];
		nums[i] = temp;
	}
}
