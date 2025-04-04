package Array;

import java.util.Arrays;

public class ApplyOperations {

    public static void main(String[] args) {
        int[] arr= new int[]{847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        applyoper(arr);
    }

    private static void applyoper(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]==arr[i+1]) {
                arr[i]=arr[i]*2;
                arr[i+1]=0;
                i++;
            }
        }
        int writeIndex = 0;

        // Move all non-shifted elements to the front in order
        for (int num : arr) {
            if (num != 0) {
                arr[writeIndex++] = num;
            }
        }

        // Fill the remaining positions with the shifted value
        while (writeIndex < arr.length) {
            arr[writeIndex++] = 0;
        }



        System.out.println(Arrays.toString(arr));
    }
}
