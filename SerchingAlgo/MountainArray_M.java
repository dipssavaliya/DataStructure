package SerchingAlgo;

public class MountainArray_M {

	public static void main(String[] args) {
		int[] arr = {3,4, 9,2,1 };
		searchMountainArray(arr);
	}

	private static void searchMountainArray(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int ans = 0;

		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			ans = arr[arr.length-1];
		} else {
			for (int i = 0; i < arr.length ; i++) {
				int mid = (low + high) / 2;
				if (arr[mid] < arr[mid + 1]) {
					low = mid + 1;
				} else if (arr[mid] > arr[mid + 1] && low!=high) {
					high = mid;
				} else {
					ans = arr[mid];
				}
			}
		}
		System.out.print(ans);
	}

}
