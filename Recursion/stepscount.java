package Recursion;

public class stepscount {
  public static void main(String[] args) {
    System.out.println(stepscount(14));
  }

  static int step = 0;

  private static int stepscount(int num) {
    if (num == 0) {
      return step;
    }
    if (num % 2 == 0) {
      step = step + 1;
      return stepscount(num / 2);
    } else {
      step = step + 1;
      return stepscount(num - 1);

    }
  }

}
