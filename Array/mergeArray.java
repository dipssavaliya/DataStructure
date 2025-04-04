package Array;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {1, 2},
                {2, 3},
                {4, 5}
        };
        int[][] arr2 = new int[][]{
                {1,4},
                {3,2},
                {4,1}
        };
        mergeArrayMethod(arr2,arr2);
    }

    private static int[][] mergeArrayMethod(int[][] arr1, int[][] arr2) {

        int[][] ans = new int[arr1.length+arr2.length][arr1[0].length];

        for(int i=0;i<arr1.length && i<arr2.length ;i++){

            for(int j=0;j<arr1[0].length;j++){
                if(arr1[i][j]==arr2[i][j]){
                   
                }

            }
        }


        return ans;

    }
}
