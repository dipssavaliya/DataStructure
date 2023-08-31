package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MissingAllNumbers {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 5 };
	    List<Integer> lst=findAllmissing(nums);
	    System.out.println(lst.toString());
		// System.out.println(numsays.toString(nums));
	}

	private static List<Integer> findAllmissing(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;

			}
		}
		List<Integer> ans = new ArrayList<Integer>();
		for (int index = 0; index < nums.length; i++) {
			if (nums[index] != index) {
				ans.add(index);
			}
		}
		return ans;
	}

	private static void swap(int[] nums, int i, int correct) {
		int temp = nums[correct];
		nums[correct] = nums[i];
		nums[i] = temp;

	}
}
