package SerchingAlgo;

public class insertArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7 };
		int key = 4;
		insertArrayElement(arr, key);
	}

	public static void insertArrayElement(int[] arr, int key) {
		int start=arr[0];
		int end=arr.length-1;
		int mid=(start+end)/2;
		if(key>mid)
		{
			start=mid+1;
		}
		else
		{
			end=mid-1;
		}
	}
}
