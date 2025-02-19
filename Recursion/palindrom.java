package Recursion;

public class palindrom {

  private static int pali1(int n) {
    int len = (int) (Math.log10(n)) + 1;
    return helper(n, len);
  }

  private static int helper(int n, int len) {
    if (n % 10 == n) {
      return n;
    }
    int rem = n % 10;
    return rem * (int) Math.pow(10, len - 1) + helper(n / 10, len - 1);
  }

  public static void main(String[] args) {
    int number = 121;
    int reverse = pali1(number);
    System.out.println(reverse);
  }

}
