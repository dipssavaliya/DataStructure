package RecursionPatternsSorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 2, 1 };
		arr = mergeSotMethod(arr);
		System.out.println(Arrays.toString(arr));
	}
//devide the array into two parts
	public static int[] mergeSotMethod(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int mid = arr.length / 2;
		int[] left = mergeSotMethod(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSotMethod(Arrays.copyOfRange(arr, mid, arr.length));

		return mergeArrays(left, right);
	}
//merge the two parts
	private static int[] mergeArrays(int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] mix = new int[left.length + right.length];
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				mix[k] = left[i];
				i++;
			} else {
				mix[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
			mix[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			mix[k] = right[j];
			j++;
			k++;
		}
		return mix;
	}
}
