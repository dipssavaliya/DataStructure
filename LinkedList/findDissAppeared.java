package LinkedList;

import java.util.*;

public class findDissAppeared {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> ans = findDisappearedNumbers(arr);
		for (int a : ans) {
			System.out.println(a);
		}

	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		java.util.Arrays.sort(nums);
		for (int num : nums) {
			System.out.println(num);
		}
		int first = nums[0];
		int last = nums[nums.length - 1];
		System.out.println("first " + first);
		System.out.println("last " + last);
		List<Integer> ans = new ArrayList();
		// ans.addAll(nums);
		for (int i = first; i < last; i++) {
			if (i == nums[i]) {
				System.out.print("nums i =" +nums[i]);
				continue;
			} else {
				System.out.print("nums i =" +nums[i]);
				ans.add(i);
			}
		}
		return ans;
	}
}