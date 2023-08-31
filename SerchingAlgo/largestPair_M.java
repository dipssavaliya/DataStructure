package SerchingAlgo;

public class largestPair_M {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 10, 6, 40 };
		largepairMethod(arr);
	}

	private static void largepairMethod(int[] arr) {
		int j = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + arr[j] > max) {
				max = arr[i] + arr[j];

				if (arr[j] < arr[i]) {
					j = i;
				}
			}
		}
		System.out.println(max);
	}
}
