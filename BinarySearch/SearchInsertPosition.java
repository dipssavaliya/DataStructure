package BinarySearch;

public class SearchInsertPosition {
	public static void main(String[] args) {
		SearchInsertPosition s = new SearchInsertPosition();
		int[] nums = { 11, 13, 15, 16 };
		int target = 10;
		System.out.println(s.searchTargetExist(nums, target));
	}

	public int searchTargetExist(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else if (target == nums[mid]) {
				ans = mid;
				return ans;
			}
		}
		return start;
	}
}
