public class powerOf3 {
  public static void main(String[] args) {
    int n = 2147483647;
    boolean ans = powerOf3Method(n);
    System.out.println(ans);
  }

  private static boolean powerOf3Method(int n) {
    return helperPoweMethod(n, 0);

  }

  private static boolean helperPoweMethod(long n, int power) {
    if (n == (long) Math.pow(3, power)) {
      return true;
    } else if ((long) Math.pow(3, power) > n) {
      return false;
    } else {
      return helperPoweMethod(n, power + 1);
    }
  }
}