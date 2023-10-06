package BackTracking;

public class MazeRestrictedPath {
    public static void main(String[] args) {
      //  pathRestriction("",arr,)
      boolean[][] arr={
       {true,true,true},
        {true,false,true},
         {true,true,true},
      };
      pathRestriction("", arr, 0, 0);
    }

    static void pathRestriction(String p, boolean maze[][], int r, int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false)
        {
            return;
        }
        if(r<maze.length-1)
        {
            pathRestriction(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1)
        {
            pathRestriction(p+'R', maze, r, c+1);
        }
    }
    
}
