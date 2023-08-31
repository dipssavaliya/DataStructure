package SerchingAlgo;

public class MaximumandDecrsing {

	public static void main(String[] args) {
		int arr[] = {  500, 3, 2, 1 ,8, 10, 20, 80, 100, 200, 400};
		MaximumandDecrsingMethod(arr);

	}

	private static void MaximumandDecrsingMethod(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i + 1] < arr[i] && i + 1 < arr.length) {
				System.out.println("Maximum decresing number is " + arr[i]);
				break;
			}
			if (arr[i + 1] > arr[i] && i + 1 == arr.length) {
				System.out.println("Maximum decresing number is " + arr[i + 1]);
				break;
			}
			if (arr[i] > arr[i + 1]) {
				max = arr[i];
			}
			
		}
		if(max!=0)System.out.println("Maximum decresing number is " + max);
		
	}

}
