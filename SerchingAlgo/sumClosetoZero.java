package SerchingAlgo;

public class sumClosetoZero {

	public static void main(String[] args) {
		int[] arr = { 10, -89, 34, -12, 20, -17 };
		sumClosetoZeroMethod(arr);
	}

	private static void sumClosetoZeroMethod(int[] arr) {
		int min_sum = arr[0] + arr[1];
		int index_l = 0;
		int index_r = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
					index_l = i;
					index_r = j;

				}
			}
		}
		System.out.println("min Sum " + Math.abs(min_sum) + "\n" + "index_l =" + index_l + "\n"+ "index_r = " + index_r);
	}

}
