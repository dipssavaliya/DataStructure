package SerchingAlgo;

public class findPair {

	public static void main(String[] args) {
		int arr[] = { 1, 8, 30, 40, 100 };
		int n = -60;
		findPairmethod(arr, n);

	}

	private static void findPairmethod(int[] arr, int n) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[j]-arr[i]==n || arr[i]-arr[j]==n)
				{
					System.out.println("pair is : "+arr[j]+"\n"+arr[i]);
					break;
				}
			}
		}

	}

}
