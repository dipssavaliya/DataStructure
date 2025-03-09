package Recursion;

public class diceProblem {
  public static void main(String[] args) {
    diceProMethod("", 4);
  }

  private static void diceProMethod(String processed, int target)
  {
    if (target == 0)
    {
      System.out.println(processed);
      return;
    }
    for (int i = 1; i <= 6 && i<= target; i++)
    {
      if (i <= target)
      {
        diceProMethod(processed + i, target - i);
        //diceProMethod(processed, target);

      }
    }
  }
}
