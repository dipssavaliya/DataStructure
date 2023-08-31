package SerchingAlgo;

public class tripletsForZero {

	public static void main(String[] args) {
		int[] arr = { 0, -1, 2, -3, 1 };
		tripletsForZeroMethod(arr);
	}

	private static void tripletsForZeroMethod(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int low = arr[i + 1];
			int high = arr[arr.length - 1];
			int a = arr[0];
			if (a + low + high == 0) {
				System.out.println("the numbers are : " + "\n" + a + "\n" + low + "\n" + high);
				break;
			} else if (a + low + high < 0) {
				low++;
			} else {
				high--;
			}
		}
	}

}
