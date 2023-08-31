package Sorting;

import java.util.Arrays;

public class Cyclic {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void cyclicsort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, arr[i], arr[correct]);
			} else {
				i++;

			}
		}
	}

	private static void swap(int[] arr, int i, int correct) {
		int temp=correct;
		correct=i;
		i=temp;
		
	}
}
