package Array;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNum {
  public static void main(String[] args) {
    lexicalOrder(13);

  }
  public static void lexicalOrder(int n) {
    List<String> ans = new ArrayList();    
    for(int i=1;i<=n;i++)
    {
      ans.add(String.valueOf(i));
    }
  
   // return ans;

  }
}
