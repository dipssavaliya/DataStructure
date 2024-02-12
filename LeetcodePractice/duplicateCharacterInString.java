package LeetcodePractice;

public class duplicateCharacterInString {
  public static void main(String[] args) {
    String str="dipali";
  removeduplicatesfromstring(new boolean[26],0,new StringBuilder(""),str);
  }

  public static void removeduplicatesfromstring(boolean map[], int index, StringBuilder sb, String str)
  {
    if(index==str.length())
    {
      System.out.println(sb);
      return;
    }
     
      char currentChar = str.charAt(index);
      if(map[currentChar-'a']==true)
      {
        removeduplicatesfromstring(map, index+1, sb, str);
      }
      else
      {
        map[currentChar-'a']=true;
        removeduplicatesfromstring(map, index+1, sb.append(currentChar), str);
      }
  }
}
