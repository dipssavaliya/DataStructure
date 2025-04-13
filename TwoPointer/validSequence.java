package TwoPointer;

public class validSequence {
  public static void main(String[] args) {
    String word1 = "aaaaaa";
    String word2 = "aaabc";
    int[] ans =  validSeq(word1,word2);
  }

  private static int[] validSeq(String word1, String word2) {
    char[] hash = new char[word1.length()];
    for(int i=0;i<word1.length();i++)
    {
        char c = word1.getChar(i);
        hash[c]=word1.getChar(c);
    }
  }
}
