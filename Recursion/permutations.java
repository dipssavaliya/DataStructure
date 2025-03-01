public class permutations {
  public static void main(String[] args) {
    String up = "abc";
    callPerutations("", up);
  }

  private static void callPerutations(String processed, String up) {
    if (up.isEmpty()) {
      System.out.println(processed);
      return;
    }
    char ch = up.charAt(0);
    for (int i = 0; i <= processed.length(); i++) {
      String first = processed.substring(0, i);
      String second = processed.substring(i, processed.length());
      callPerutations(first + ch + second, up.substring(1));
    }
  }
}
