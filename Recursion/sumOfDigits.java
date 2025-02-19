package Recursion;

public class sumofdigits {
  public static void main(String[] args) {
    System.out.println(sum(12345));
  }

  private static int sum(int number) {
    return helper(number, 0);
  }

  private static int helper(int number, int sum) {
    if (number == 0) {
      return sum;
    }
    int rem = number % 10;
    sum += rem;
    return helper(number / 10, sum);
  }

}
