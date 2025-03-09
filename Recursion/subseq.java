package Recursion;

import java.util.ArrayList;

public class subseq {
  static int count = 0;

  public static void main(String[] args) {
    //subseq("", "abc");
    // ArrayList<String> list = new ArrayList<>();
    // list = subseqList("", "abc");
    // System.out.println(list.toString());
    //subseqCount(0, "", "abc");
  }

  private static void subseq(String processed, String up) {
    if (up.isEmpty()) {
      System.out.println(processed);
      return;
    }
    char ch = up.charAt(0);
    subseq(processed + ch, up.substring(1));
    subseq(processed, up.substring(1));
  }

  private static int subseqCount(int count, String processed, String up) {
    if (up.isEmpty()) {
      int number = 0;
      number++;
      return number; // System.out.println("count is " + count);
    }
    char ch = up.charAt(0);
    subseqCount(count + 1, processed + ch, up.substring(1));
    subseqCount(count + 1, processed, up.substring(1));
    return count;
  }

  private static ArrayList<String> subseqList(String processed, String up) {
    if (up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(processed);
      return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> left = subseqList(processed + ch, up.substring(1));
    ArrayList<String> right = subseqList(processed, up.substring(1));
    left.addAll(right);
    return left;
  }
}
