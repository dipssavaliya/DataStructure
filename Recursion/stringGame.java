public class stringGame {
  public static void main(String[] args) {
    String up = "a";
    int k = 5;
    char ch = findCharacterInString(k, up);
    System.out.println(ch);
  }

  private static char findCharacterInString(int k, String up) {
    return helperFindChar(k, "", up);
  }

  private static char helperFindChar(int k, String needToAppend, String generatedString) {
    if((generatedString.length())>=k)
    {
      return generatedString.charAt(k-1);
    }
    int len = generatedString.length();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<len;i++)
    {
      char current =  generatedString.charAt(i);
      char newChar;
      if(current=='z')
      {
        newChar = 'a';
      }
      else{
       newChar = (char)(current+1);
      }
      sb.append(newChar);
    }
    String result = sb.toString();
    return helperFindChar(k, result, generatedString+result);
  }

}
