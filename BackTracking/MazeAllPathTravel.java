package BackTracking;

import java.util.Arrays;

public class MazeAllPathTravel
{
    public static void main(String[] args) {
        boolean[][] arr={
            {true,true,true},
             {true,true,true},
              {true,true,true},
           };
           int[][] path = new int[arr.length][arr[0].length];
           
      mazeAllPathMethod("", arr,path, 0, 0,1);
    }
    static void mazeAllPathMethod(String p, boolean maze[][], int[][] path,int r, int c,int index)
    {   

        if(r==maze.length-1 && c==maze[0].length-1)
        {
            for(int[] arr:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
          if(maze[r][c]==false)
        {
            return;
        }
        maze[r][c]=false;
        path[r][c]=index;
        if(r<maze.length-1)
        {
            mazeAllPathMethod(p+'D', maze,path, r+1, c,index+1);
        }
        if(c<maze[0].length-1)
        {
            mazeAllPathMethod(p+'R', maze,path, r, c+1,index+1);
        }
      
        if(r>0)
        {
            mazeAllPathMethod(p+'U', maze,path, r-1, c,index+1);
        }
        if(c>0)
        {
            mazeAllPathMethod(p+'L', maze, path,r, c-1,index+1);
        }  
        maze[r][c]=true;   
        path[r][c]=0;   
    }
}