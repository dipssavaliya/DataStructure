package Recursion;

public class pattern1 {
  public static void main(String[] args) {
    //printtFun1(0, 0, 4);
    printFun3(4, 0);
  }

  private static void printtFun1(int row, int col, int n) {
    // base condition
    if (row == n) {
      return;
    }
    if (col <= row) {
      System.out.print("* ");
      printtFun1(row, col + 1, n);
    } else {
      System.out.println();
      printtFun1(row + 1, 0, n);
    }
  }

  private static void printFun2(int row, int col) {

    if(row ==0)
    {
      return;
    }
    if(col<row)
    {
      System.out.print("* ");
      printFun2(row,col+1);
    }
    else
    {
      System.out.println();
      printFun2(row-1, 0);
    }
  }

  private static void printFun3(int row, int col) {

    if(row ==0)
    {
      return;
    }
    if(col<row)
    {
      printFun3(row,col+1);
      System.out.print("* ");
    }
    else
    {
      printFun3(row-1, 0);
      System.out.println();
    }
  }

  

}
