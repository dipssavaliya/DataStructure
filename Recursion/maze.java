package Recursion;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        solveMaze(0,0,"",arr);
    }

    private static void solveMaze(int row, int col, String processed,int[][] arr) {
        if(col == 2 && row==2)
        {
            System.out.println(processed);
            return;
        }
        if (row < arr.length - 2 && col < arr[row].length-2 && (row-1 !=arr.length - 1) && (col-1 !=arr[row].length - 1)  ) {
            solveMaze(row, col + 1, processed + "R", arr);
            solveMaze(row + 1, col, processed + "D",  arr);
        }
        if(row-1 == arr.length-1)
        {
            solveMaze(row, col + 1, processed + "R",  arr);
        }
        if((col-1 !=arr[row].length - 1))
        {
            solveMaze(row + 1, col, processed + "D",  arr);
        }

    }
}
