package BackTracking;

import java.util.Arrays;

public class maze {
    public static void main(String[] args) {
        //System.out.println(count(3, 3));
       // mazepath("", 3, 3);
        boolean[][] arr = new boolean[][]{
            {true,true,true},
            {true,true,true},
            {true,true,true}   
        };
       // mazeWithObstecle("", arr,0, 0);
       //mazeWithObstecleAllPath("", arr, 0, 0);
       int[][] path = new int[arr.length][arr[0].length];
       mazeWithObstecleAllPathPrint("",arr,0,0,path,1);
    }

    private static void mazeWithObstecle(String processed,boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(processed);
            return;
        }
        if(maze[r][c]==false)
        {
            return;
        }
        if(r<maze.length-1)
        {
            mazeWithObstecle(processed+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1)
        {
            mazeWithObstecle(processed+'R', maze, r, c+1);
        }
    }

    private static void mazeWithObstecleAllPath(String processed,boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(processed);
            return;
        }
        if(maze[r][c]==false)
        {
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            mazeWithObstecleAllPath(processed+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1)
        {
            mazeWithObstecleAllPath(processed+'R', maze, r, c+1);
        }
        if(r>0)
        {
            mazeWithObstecleAllPath(processed+'U', maze, r-1, c);
        }
        if(c>0)
        {
            mazeWithObstecleAllPath(processed+'L', maze, r, c-1);
        }
        maze[r][c]=true;
    }

    private static void mazeWithObstecleAllPathPrint(String processed,boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r == maze.length-1 && c==maze[0].length-1)
        {
            for(int[] a:path)
            {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }
        if(maze[r][c]==false)
        {
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1)
        {
            mazeWithObstecleAllPathPrint(processed+'D', maze, r+1, c,path,step+1);
        }
        if(c<maze[0].length-1)
        {
            mazeWithObstecleAllPathPrint(processed+'R', maze, r, c+1,path,step+1);
        }
        if(r>0)
        {
            mazeWithObstecleAllPathPrint(processed+'U', maze, r-1, c,path,step+1);
        }
        if(c>0)
        {
            mazeWithObstecleAllPathPrint(processed+'L', maze, r, c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }

    private static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    private static void mazepath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1) {
            mazepath(p + 'D', r - 1, c - 1);
        }
        if (r > 1) {
            mazepath(p + 'V', r - 1, c);
        }
        if (c > 1) {
            mazepath(p + 'H', r, c - 1);
        }
    }

}
